/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.employee.version3;

/**
 *
 * @author User
 */
public class Name {

    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

    public Name() {
    }

    public Name(String title, String firstName, String middleName, String lastName, String suffix) {
        this.title = title;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    public Name(String firstName, String middleName, String lastName, String suffix) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void displayName() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        if (title == null) {
            return String.format("%s %s %s %s", getFirstName(), getMiddleName(), getLastName(), getSuffix());
        } else if (suffix == null) {
            return String.format("%s %s %s", getFirstName(), getMiddleName(), getLastName());
        }else if (middleName == null){
            return String.format("%s %s %s", getFirstName(), getLastName());
        }

        return String.format("%s %s %s %s %s", getTitle(), getFirstName(), getMiddleName(), getLastName(), getSuffix());
    }

}
