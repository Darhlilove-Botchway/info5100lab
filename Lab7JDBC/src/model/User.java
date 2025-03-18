/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Darhlilove Botchway
 */
public class User {
    private int userId;
    private String firstName;
    private String lastName;
    private String gender;
    private String dateOfBirth;
    private String email;
    private String phoneUnformatted;
    private String phoneFormatted;
    private String hobby;
    private int age;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public String getFirstName () {
    return firstName;
    }
    
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    
        public String getLastName () {
    return lastName;
    }
    
    public void setLastName (String lastName) {
        this.lastName = lastName;
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
        return phoneUnformatted;
    }
    
    public void setPhoneUnformatted () {
        this.phoneUnformatted = phoneFormatted.replaceAll("[^0-9]", "");
    }
    
    public String getPhoneFormatted () {
        return phoneFormatted;
    }
    
    public void setPhoneFormatted (String phoneFormatted) {
        this.phoneFormatted = phoneFormatted;
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
    
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    
    @Override
    public String toString() {
        return "User Profile Information \n" 
                    + "\n First name:" + firstName
                    + "\n Last name: " + lastName
                    + "\n Date of Birth: " + dateOfBirth
                    + "\n Gender: " + gender
                    + "\n Age: " + age
                    + "\n Phone: " + phoneFormatted
                    + "\n Email: " + email
                    + "\n Hobbies: " + hobby.replaceAll("\\s+", " ");
    }
    
}
