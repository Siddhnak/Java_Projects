package com.seicho.springbootrestapi.bean;

public class Student{ //First step of java bean creation
    private int id;
    private String firstName;
    private String lastName;
//    private String skinColor;
//    private String eyeColor;

//    public Student(String skinColor,String firstName,String eyeColor) {
//        this.skinColor = skinColor;
//        this.firstName=firstName;
//        this.eyeColor=eyeColor;
//
//    }

    //Creating a parameterized constructor for the student class..
    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;

    /*Parametrized constructors are required to pass parameters on creation of
    objects.We can overload constructors with different datatypes as its parameters.
     */
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public String getSkinColor() {
//        return skinColor;
//    }
//
//    public void setSkinColor(String skinColor) {
//        this.skinColor = skinColor;
//    }
//
//    public String getEyeColor() {
//        return eyeColor;
//    }
//
//    public void setEyeColor(String eyeColor) {
//        this.eyeColor = eyeColor;
//    }
}
