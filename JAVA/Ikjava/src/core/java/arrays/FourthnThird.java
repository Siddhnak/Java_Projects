package core.java.arrays;

public class FourthnThird {

        public static void main(String[] args) {

            /*Code to print the largest of the elements*/

            int a[] = {2, 4, 5, 58, 64, 89, 454};
            int max1,max2,max3,max4;
            max1 = max2 = max3 = max4 = a[0];// ILT


            int i;
//        Arrays.sort(a);// Ascending order sort
//
//        System.out.println("Sorted array"+a);
//        int third_max = a[a.length -3];
//
//        System.out.println(third_max);

            for (i = 0; i < a.length; i++) {
//            sum=a[i]+a[i+1]; First trial Wrong
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

        }
    }

/*
Notes from GPT
When I mention "shifted down" in this context, I mean that the current values of max1, max2, and max3 are reassigned to the next variable in line.

For example, in the if condition if (a[i] > max1), if a[i] is greater than max1, it means that a[i] becomes the new largest element. To accommodate this change, the current values of max1, max2, and max3 need to be shifted down to their respective variables.

Here's how the shifting works:

1. max3 is assigned the current value of max2. This is because the previous max2 becomes the new max3 since it is smaller than the new largest element a[i].
2. max2 is assigned the current value of max1. This is because the previous max1 becomes the new max2 since it is smaller than the new largest element a[i].
3. max1 is assigned the value of a[i]. This is because a[i] is now the largest element.

By shifting the values down, we ensure that the current largest element is stored in max1, the second-largest element is stored in max2, and the third-largest element is stored in max3.
*/
