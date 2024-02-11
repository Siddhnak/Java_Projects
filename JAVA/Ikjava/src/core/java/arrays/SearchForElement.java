package core.java.arrays;

public class SearchForElement {

        public static void main(String[] args) {

            /*Code to print the sum of the elements*/
//        int a[] = {45, 4, 5, 6, 8, 566, 454};
//        int sum=0;
//        for (int i = 0; i<a.length; i++) {
////            sum=a[i]+a[i+1]; First trial Wrong
//            sum+=a[i];
//        }
//        System.out.println(sum);

            int a[] = {45, 4, 5, 6, 8, 566, 454};
            for(int x:a){
                if(x==5) {

                    System.out.println("the element 5 is present at index: " + x);
                }
                else{
                System.out.println("Sorry the element is missing");}
            }}


    }

