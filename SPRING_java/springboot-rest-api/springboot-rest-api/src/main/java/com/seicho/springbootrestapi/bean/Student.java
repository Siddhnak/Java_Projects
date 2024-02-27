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
        //Doll example

        /*Absolutely! That's a great way to put it.

In this analogy:

- The doll's outfits and accessories are like the variables in a Java class. These are the pieces of data that you want to manage and control.

- The magic wand is like the constructor. It's the special tool you use to create a new doll and set it up with the initial outfits and accessories.

So, just as you use the magic wand to create a new doll and give it its starting look, in Java,
you use the constructor to create a new object and set it up with its initial values. Great analogy!*/

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
