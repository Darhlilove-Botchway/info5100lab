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
    protected String name;
    protected String nameProperCase;
    protected int age;
    protected String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProperName() {
        return nameProperCase;
    }

    public void setProperName() {
        this.nameProperCase = name.substring(0,1).toUpperCase() + name.substring(1);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User Profile Information \n" 
                    + "\n First name: " + nameProperCase
                    + "\n Last name: " + age
                    + "\n Date of Birth: " + email;
    }
    
}
