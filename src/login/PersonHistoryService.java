package login;

import java.util.List;

public interface PersonHistoryService {
	
	public void addPerson(PersonLogin newPerson);
	
	public List<PersonLogin> getPerson();
	
	public void deletePerson(PersonLogin person);
	
	public boolean verifyCredentials(String userName, String password);
	
	public PersonLogin getUser(String userName);
        
        public PersonLogin getUserById(String nuID);
	
	public void setCurrentUser(String userName);
	
	public PersonLogin getCurrentUser();
	
	public PersonLogin updateUser(PersonLogin person, String attribute, String oldValue, String newValue);

}
