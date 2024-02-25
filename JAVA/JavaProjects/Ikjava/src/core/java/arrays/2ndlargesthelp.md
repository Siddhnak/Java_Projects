<details>
<summary>Compare these 2 codes for me please</summary>
<summary>
this works fine..
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

however this one gives error having same logic doesn't work
package core.java.arrays;

public class SecondLargest {
public static void main(String[] args) {
int sarr[]={44,27,3,39,2};

        int max1,max2;
        max1=max2=sarr[0];

        for(int i=0;i<sarr.length;i++){
            if(sarr[i]>max1){
                max2=max1;
                max1=sarr[i];
            }
            else if(sarr[i]>max2)
            {
                max2=sarr[i];
            }
        }
        System.out.println("2nd largest element is :"+max2+"\n largest :"+max1);
    }
}

I apologize if my previous explanation was not clear. Let's break it down further:

The key difference between the two code snippets lies in how they handle the initialization of the `max` variables and how they update these variables.

**First Code Snippet (Sc_82):**
- You're finding the first, second, third, and fourth largest numbers in an array.
- You initialize `max1`, `max2`, `max3`, and `max4` to the first element of the array.
- Then, for each element in the array, you check if it's larger than `max1`, `max2`, `max3`, or `max4` and update these variables accordingly.
- This code works fine because you're always comparing with and updating four variables.

**Second Code Snippet (SecondLargest):**
- You're trying to find the largest and second largest numbers in an array.
- You initialize `max1` and `max2` to the first element of the array.
- Then, for each element in the array, you check if it's larger than `max1` or `max2` and update these variables accordingly.
- However, this code can give incorrect results when the largest number is at the beginning of the array. This is because both `max1` and `max2` are initialized to the first element, and `max2` isn't updated unless it finds a number which is smaller than `max1` but larger than `max2`. In this case, all other numbers are smaller than both `max1` and `max2`, so `max2` remains as the first element.

The issue with the second code snippet arises from initializing both `max1` and `max2` to the first element of the array. If this first element happens to be the largest number in the array, then `max2` will not be updated correctly because all other numbers will be smaller than both `max1` and `max2`.

To fix this issue in the second code snippet, you can initialize `max1` and `max2` to the smallest possible integer value (`Integer.MIN_VALUE`). This ensures that any number in your array will be larger than the initial values of `max1` and `max2`, so they will be updated correctly.

I hope this clarifies things! Please let me know if you have any other questions. 😊
</summary> 


</details>