package core.java.strings;

class Lexi6 {
    //Q 6
    public String s1= "abcd";
    public String s2= "aBcD";



    public void lengthCheck(){
        if(s1.length()==s2.length());
        System.out.println("Length are the same");

    }
    public void charCheck(){
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("\nThey are equal");
        }
        else{
            System.out.println("They're"
                    +" unequal");
        }
    }

    public static void main(String []args){

        Lexi6 l=new Lexi6();
        l.lengthCheck();
        l.charCheck();
    }
}
