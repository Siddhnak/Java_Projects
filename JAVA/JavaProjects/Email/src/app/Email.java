package app;
import java.sql.SQLOutput;
import java.util.*;


public class Email {
Scanner sc= new Scanner(System.in);
private String fname;
private String lname;
private String dept;
private String email;
private String password;
private String mailCapacity;

//Contructor to get the first and last name

    public Email(String fname,String lname) {
        this.fname=fname ; //basically copying the value of fname from top to belw
        this.lname=lname ;
        System.out.println("NEW emp: "+this.fname+this.lname);

    }
    //Generate the mail method
    private String generate_email(){
        return this.fname.toLowerCase()+"."+
                this.lname.toLowerCase()+"@"+this.dept.toLowerCase()+"company.com";
    }
    private  String setDept(){
        System.out.println("Department codes \nPress 1 for Sales \nPress 2 for Business \nPress 3 for Merger");
        Boolean flag= false;
        do{
            System.out.println("Enter dep code");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    return "Sales";
                case 2:
                    return "Business";
                case 3:
                    return "Merger";
                default:
                    System.out.println("Bhaag yaha se..!!");

            }

        }while(!flag);
        return null;
    }

}
