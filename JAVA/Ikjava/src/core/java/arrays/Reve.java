package core.java.arrays;

public class Reve {
    public static void main(String[] args) {
//        int a[]={1,2,3,4,5};
//
//        for(int i=a.length-1;i>=0;i--){
//            System.out.println(a[i]);
        //a.length-1 is the last character always as index starts from zero
//        }
//    }


        //CODE for print print element at even positions
        {
            int a[] = {1, 2, 3, 4, 5,6};

            for (int i = 0; i<=a.length-1; i++) {
//                if(i%2==0)
//                    System.out.println(a[i]);
            }
        }
        //CODE for print print element at odd positions

        {
            int a[] = {1, 2, 3, 4, 5,6};

            for (int i = 0; i<=a.length-1; i++) {
//                if(i%2!=0)
//                    System.out.println(a[a.length-1]);
            }
        }

        // Program to print the largest element in an array and sum too
        { /*Code to print the largest of the elements*/

            int a[] = {45, 4, 5, 6, 8, 566, 454};
            int max =a[0]; // ILT
            int sum=0;
            for (int i = 0; i<a.length; i++) {
//            sum=a[i]+a[i+1]; First trial Wrong
                if(a[i]>max){
                    max=a[i];}
                sum+=a[i];

            }
//            System.out.println(max);
//            System.out.println("sum is "+sum );
        }

        { /*Code to print the SMALLEST of the elements*/

            int a[] = {45, 4, 5, 6, 8, 566, 454};
            int small =a[0]; // ILT
            int sum=0;
            for (int i = 0; i<a.length; i++) {
//            sum=a[i]+a[i+1]; First trial Wrong
                if(a[i]<small){
                    small=a[i];}
//                sum+=a[i];

            }
            System.out.println(small);
//            System.out.println("sum is "+sum );
        }

        { /*Code to count of the elements*/

            int a[] = {45, 4, 5, 6, 8, 566, 454};
            int count =0; // ILT
            int sum=0;
            for (int i = 0; i<a.length; i++) {
//            sum=a[i]+a[i+1]; First trial Wrong
                count+=1;
//                if(a[i]<small){
//                    small=a[i];}
//                sum+=a[i];

            }
            System.out.println("Number of elements "+count);
//            System.out.println("sum is "+sum );
        }

    }
}