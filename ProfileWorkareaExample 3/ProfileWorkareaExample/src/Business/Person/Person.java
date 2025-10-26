/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author kal bugrara
 */
public class Person {

    String id;

    public Person(String id, String name, String emailId) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
    }
    String name;
    String emailId;

    public Person(String id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPersonId() {
        return id;
    }

    public boolean isMatchByUniversityId(String id) {
        if (getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public boolean isMatchByEmailId(String emailId) {
        if (getEmailId().equals(emailId)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return getPersonId();
    }
}
