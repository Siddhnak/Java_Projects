package core.java.arrays;

public class LeftRotation {
    //Left shift element



    class Mamain{
        public static void main(String[] args) {
            int a[]={2,3,4,6,8,9,45};

            int temp= a[0];
            for( int i=1;i<a.length;i++){
//           a[i]=a[i+1];
                a[i-1]=a[i];
//            System.out.println(a[i]);
            }
            a[a.length-1]=temp;

            for(int x:a)
                System.out.println(x+",");

        }
    }


    public class RotaAr {
        public static void main(String[] args) {
            int A[]= {1,2,3,4,5,6};

            for (int i=0;i<A.length;i++)

                System.out.print(A[i]);
            System.out.println("\nAbove is the unrotated array");

            int temp= A[0];
            for ( int i=1;i<A.length-1;i++) //For travrsing the array
            {
                A[i-1]=A[i];
            }
            A[A.length-1]=temp;

            for (int i=0;i<A.length;i++)
                System.out.print(A[i]);

            System.out.println("\nAbove is the rotated array");

        }
    }

}
