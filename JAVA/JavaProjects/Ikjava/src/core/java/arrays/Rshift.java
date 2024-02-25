package core.java.arrays;

public class Rshift {

        public static void main(String[] args) {

            //try to shift to right
            int a []={1,2,3,4,5,6,27,28};
//        System.out.println(a.length);

            int temp = a[a.length-1];
            for(int i =a.length-1;i>0;i--){
                a[i]=a[i-1];
            }
            a[0]=temp;

            for (int x:a)
                System.out.print(x+",");

        }

}
