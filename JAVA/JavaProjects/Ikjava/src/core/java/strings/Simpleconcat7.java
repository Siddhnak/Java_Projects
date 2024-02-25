package core.java.strings;

class SimpleConcat {
    //Q 7
    public  String s1= "hulk";
    public  String s2= "Naik";

    public void conCat(){
        String s3 = s1.concat(s2);
        System.out.println("Here's your merged string "+s3);
    }
    //Or do this   public String conCat(){ // Changed return type to String
    //     return s1.concat(s2);
    // }


    public static void main(String []args){


        SimpleConcat l=new SimpleConcat();
        l.conCat();
        // System.out.println(s1);

        // l.lengthCheck();
        // l.charCheck();
    }
}