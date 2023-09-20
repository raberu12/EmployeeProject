/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version3;

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

    public Name title(String title) {
        this.title = title;
        return this;
    }

    public Name firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Name lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Name middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public Name suffix(String suffix) {
        this.suffix = suffix;
        return this;
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
        StringBuilder fullName = new StringBuilder();
        if (firstName != null) {
            fullName.append(firstName);
        }
        if (middleName != null) {
            fullName.append(" ").append(middleName);
        }
        if (lastName != null) {
            fullName.append(" ").append(lastName);
        }
        if (suffix != null) {
            fullName.append(", ").append(suffix);
        }
        if (title != null) {
            fullName.insert(0, title + " ");
        }
        return fullName.toString();
    }
}
