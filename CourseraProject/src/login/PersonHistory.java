/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.util.ArrayList;

/**
 *
 * @author visma
 */
public class PersonHistory {
    
    private ArrayList<PersonLogin> history;
    
    public PersonHistory(){
        this.history = new ArrayList<PersonLogin>();
        
    }

    public ArrayList<PersonLogin> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<PersonLogin> history) {
        this.history = history;
    }
    
    
        
    /*public PersonLogin addNewPerson(){
       
        PersonLogin newPerson = new PersonLogin();
        history.add(newPerson);
        return newPerson;
    }*/    


    public void deleteVitals(PersonLogin vs) {
        history.remove(vs);
    }
    
}
