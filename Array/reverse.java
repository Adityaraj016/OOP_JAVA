package Array;

import java.util.*;

public class reverse {
    public static void main(String[] args) {
//        int []a={1,2,3,4,5};
//        int []b=new int[a.length];
//        int i=0;
//        for(int j=a.length-1;j>=0;j--){
//            b[i]=a[j];
//            i++;
//        }
//        for(int element:b){
//            System.out.println(element);
//        }

        int []a={1,2,3,4,5};
        int temp;
        int j=a.length;
        for(int i=0;i<j/2;i++){
            temp=a[i];
            a[i]=a[j-i-1];
            a[j-i-1]=temp;
        }
        for(int e:a){
            System.out.print(e+" ");
        }

//        int [] arr = {1, 2100, 3, 455, 5, 34, 67};
//        int max = Integer.MIN_VALUE;
//        //System.out.println(max);
//        for(int e: arr){
//            if(e>max){
//                max = e;
//            }
//        }
//        System.out.println("the value of the maximum element in this array is: "+ max);


        //Write a Java program to find whether an array is sorted or not.
//        boolean isSorted = true;
//        int [] arr = {1, 3, 4, 5, 34, 67,7};
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i] > arr[i+1]){
//                isSorted = false;
//                break;
//            }
//        }
//        if(isSorted){
//            System.out.println("The Array is sorted");
//        }
//        else{
//            System.out.println("The Array is not sorted");
//        }
    }
}
