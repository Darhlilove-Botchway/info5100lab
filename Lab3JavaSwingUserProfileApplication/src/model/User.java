/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nana
 */
public class User {
    private String firstName;
    private String firstNameProperCase;
    private String lastName;
    private String lastNameProperCase;
    private String gender;
    private String email;
    private String phone_unformatted;
    private String phone_formatted;
    private String hobby;
    private int age;
    
    public String getFirstName () {
    return firstName;
    }
    
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstNameProperCase () {
    return firstNameProperCase;
    }
    
    public void setFirstNameProperCase () {
        this.firstNameProperCase = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
    }
    
        public String getLastName () {
    return lastName;
    }
    
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    
    public String getLastNameProperCase () {
        return lastNameProperCase;
    }
    
    public void setLastNameProperCase () {
        this.lastNameProperCase = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
    }
    
        public String getGender () {
    return gender;
    }
    
    public void setGender (String gender) {
        this.gender = gender;
    }
    
        public String getEmail () {
    return email;
    }
    
    public void setEmail (String email) {
        this.email = email;
    }
    
    public String getPhoneUnformatted () {
        return phone_unformatted;
    }
    
    public void setPhoneUnformatted () {
        this.phone_unformatted = phone_formatted.replaceAll("[^0-9]", "");
    }
    
    public String getPhoneFormatted () {
        return phone_formatted;
    }
    
    public void setPhoneFormatted (String phone_formatted) {
        this.phone_formatted = phone_formatted;
    }
    
    public String getHobby () {
        return hobby;
    }
    
    public void setHobby (String hobby) {
        this.hobby = hobby;
    }
    
    public int getAge () {
        return age;
    }
    
    public void setAge (int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User Profile Information \n \n First name:"
                    + firstNameProperCase
                    + "\n Last name: " + lastNameProperCase
                    + "\n Gender: " + gender
                    + "\n Age: " + age
                    + "\n Phone: " + phone_formatted
                    + "\n Email: " + email;
    }
    
    
}
