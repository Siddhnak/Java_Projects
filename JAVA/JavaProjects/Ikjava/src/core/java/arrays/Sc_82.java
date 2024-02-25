package core.java.arrays;

import java.util.Arrays;

public class Sc_82 {

    public static void main(String[] args) {

        /*Code to print the largest of the elements*/

        int a[] = {2, 4, 5, 58, 64, 89, 454};
        int max1,max2,max3,max4;
        max1 = max2 = max3 = max4 = a[0];// ILT
        int i;
        for (i = 0; i < a.length; i++) {

            if (a[i]>max1) {
                max4=max3;
                max3=max2;
                max2=max1;
                max1=a[i];
            }
            else if
            (a[i]>max2){
                max4=max3;
                max3=max2;
                max2=a[i];
            }
            else if(a[i]>max3){
                max4=max3;
                max3=a[i];
            }
            else if(a[i]>max4){
//                max4=max3
                max3=a[i];
            }
        }
//            sum+=a[i];
        System.out.println("Fourthmax is " + max4);
        System.out.println("second max is " + max2);
        System.out.println("3rd max is " + max3);

    }
}