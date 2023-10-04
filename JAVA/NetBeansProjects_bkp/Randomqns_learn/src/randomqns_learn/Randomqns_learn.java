/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomqns_learn;

/**
 *
 * @author Siddhant Naik
 * https://www.tutorialspoint.com/override-the-tostring-method-in-a-java-class
 */
class Student {
   private int rno;
   private String name;
   public Student(int r, String n) {
      rno = r;
      name = n;
   }
   public String toString() {
      return rno + " " + name;
   }
}
public class Randomqns_learn {
   public static void main(String[] args) {
      Student s = new Student(101, "Susan Bones");
      System.out.println("The student details are:");
      System.out.println(s);
   }
}
