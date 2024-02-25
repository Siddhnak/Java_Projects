package core.java.strings;

class Lexi5 {
    //Q 5
    public String s1= "abcd";
    public String s2= "abcd";


    public void lengthCheck(){
        if(s1.length()==s2.length());
        System.out.println("Length are the same");

    }
    public void charCheck(){
        if(s1.equals(s2)){
            System.out.println("\nThey are equal");
        }
        else{
            System.out.println("They're"
                    +" unequal");
        }
    }

    public static void main(String []args){

        Lexi5 l=new Lexi5();
        l.lengthCheck();
        l.charCheck();
    }
}