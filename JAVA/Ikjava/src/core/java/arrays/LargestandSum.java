package core.java.arrays;

public class LargestandSum {
    public static void main(String[] args) {
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
            System.out.println(max);
            System.out.println("sum is "+sum );
        }
    }
}
