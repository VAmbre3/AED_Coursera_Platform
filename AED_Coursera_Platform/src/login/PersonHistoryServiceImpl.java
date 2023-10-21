package login;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PersonHistoryServiceImpl implements PersonHistoryService {

    
	
	public static PersonHistoryService personHistoryServiceInstance;
	
	private ArrayList<PersonLogin> history = new ArrayList<PersonLogin>();
	
	private String currentUser = "admin";
	
	public static PersonHistoryService getInstance() 
	{
		if (personHistoryServiceInstance == null) 
		{
			personHistoryServiceInstance = new PersonHistoryServiceImpl();			
			personHistoryServiceInstance.addPerson(new PersonLogin("admin", null, "admin", "123"));
		}
		return personHistoryServiceInstance;
	}
	
	
	
	@Override
	public void addPerson(PersonLogin newPerson) {		
		history.add(newPerson);
	}

	@Override
	public List<PersonLogin> getPerson() {
		return history;
	}

	@Override
	public void deletePerson(PersonLogin person) {
		history.remove(person);		
	}



	@Override
	public boolean verifyCredentials(String userID, String password) {
		for(PersonLogin person : getPerson()) {
			if(person.getUserID().equals(userID) && person.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}



	@Override
	public PersonLogin getUser(String userName) {
		for(PersonLogin person : getPerson()) {
			if(person.getUserName().equals(userName)) {
				return person;
			}
		}
		return null;
	}



	@Override
	public void setCurrentUser(String userName) {
		this.currentUser = userName;		
	}



	@Override
	public PersonLogin getCurrentUser() {
		return getUser(this.currentUser);
	}

        @Override
        public PersonLogin updateUser(PersonLogin updatedPerson, String attribute, String oldValue, String newValue) {
            for (int i = 0; i < history.size(); i++) {
                PersonLogin person = history.get(i);
                if (person.equals(updatedPerson)) {
                    switch (attribute) {
                        case "userID":
                            person.setUserID(newValue);
                            break;
                        case "userName":
                            person.setUserName(newValue);
                            break;
                        case "nuID":
                            person.setNuID(newValue);
                            break;
                        case "password": // Updated to lowercase "p" to match UserUpdateJPanel
                            person.setPassword(newValue); // You might want to encrypt it here if needed
                            break;
                    }
                }
            }
            setCurrentUser(updatedPerson.getUserName());
            return updatedPerson;
        }

        /*
	@Override
        public PersonLogin updateUser(PersonLogin updatedPerson, String attribute, String oldValue, String newValue) {
		for(int i=0; i < history.size(); i++) {
			PersonLogin person = history.get(i);
		    if(person == updatedPerson) {
		    	switch(attribute) {
		    	    case "userID":
		    		history.get(i).setUserID(newValue);
		    		break;
		    	    case "userName":
		    	    history.get(i).setUserName(newValue);
			    	break;
		    	    case "NUID":
		    	    history.get(i).setNuID(newValue);
			    	break;
		    	    case "Password":
		    	    history.get(i).setPassword(newValue);
		    	    break;
		    	}		    		
		    }
		}
		setCurrentUser(updatedPerson.getUserName());
		return updatedPerson;
	}    
        */
        
        @Override
        public PersonLogin getUserById(String nuID) {
            for (PersonLogin person : getPerson()) {
                if (nuID != null && nuID.equals(person.getNuID())) {
                    return person;
                }
            }
            
            JOptionPane.showMessageDialog(null, "No user user found.", "User Not Found", JOptionPane.INFORMATION_MESSAGE);
            
            return null;

        }

}
