package core.java.strings;

class Cw1countChar{
    //Q 7
    public  String s1= "abcdefghijklmnopqrstuvwxyz";
    public  String s2= "Naik";
    int count = 0;

    public void numChar(){
        for(int i=0;i<s1.length();i++){
            count+=1;
        }
        System.out.println("no. of char= "+count);

    }
    //Or do this   public String conCat(){ // Changed return type to String
    //     return s1.concat(s2);
    // }


    public static void main(String []args){
        Cw1countChar l=new Cw1countChar();
        l.numChar();
        // System.out.println(s1);

        // l.lengthCheck();
        // l.charCheck();
    }
}