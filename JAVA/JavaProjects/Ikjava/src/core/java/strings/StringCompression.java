package core.java.strings;

public class StringCompression {

    public static void main(String[] args) {
        String Str = "aaabbccc";
        String nstr= null;

        int acount = 0,bcount=0,ccount=0;
        char strArr[]= Str.toCharArray();

        for(char x :strArr){
            if(x=='a')
            {acount+=1;}
            if(x=='b'){bcount+=1;}
            if(x=='c'){ccount+=1;}
        }
         nstr="a"+acount+"b"+bcount+"c"+ccount;
        System.out.println("Compressed string "+nstr);
    }
}
