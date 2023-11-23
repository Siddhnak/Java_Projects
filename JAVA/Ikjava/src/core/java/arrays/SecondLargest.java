package core.java.arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int sarr[]={44,27,3,39,2};

        int max1,max2;
        max1=max2=Integer.MIN_VALUE; //read md to see why is this added

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
