/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author Darhlilove Botchway
 */
public class User {
    private String firstName;
    private String firstNameProperCase;
    private String lastName;
    private String lastNameProperCase;
    private String gender;
    private String dateOfBirthString;
    private Date dateOfBirth;
    private String email;
    private String phoneUnformatted;
    private String phoneFormatted;
    private String hobby;
    private int age;
    private ImageIcon profilePhoto;
    
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

    public ImageIcon getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(ImageIcon image) {
        this.profilePhoto = image;
    }
    
    public void setDateOfBirthString(String dateOfBirthString){
        this.dateOfBirthString = dateOfBirthString;
    }
    
    public String getDateOfBirthString(){
        return dateOfBirthString;
    }
    
    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    
    public Date getDateOfBirth(){
        return dateOfBirth;
    }
    
    @Override
    public String toString() {
        return "User Profile Information \n" 
                    + "\n First name:" + firstNameProperCase
                    + "\n Last name: " + lastNameProperCase
                    + "\n Date of Birth: " + dateOfBirthString
                    + "\n Gender: " + gender
                    + "\n Age: " + age
                    + "\n Phone: " + phoneFormatted
                    + "\n Email: " + email
                    + "\n Hobbies: " + hobby.replaceAll("\\s+", " ");
    }
    
}
