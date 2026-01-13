package generics;

import java.util.*;

public class cars_client {
    public static void main(String[] args) {
        Cars[] arr = new Cars[5];
        arr[0] = new Cars(200, 10, "White");// P S C
        arr[1] = new Cars(1000, 20, "Black");
        arr[2] = new Cars(345, 3, "Yellow");
        arr[3] = new Cars(34, 89, "Grey");
        arr[4] = new Cars(8907, 6, "Red");
        //bubble(arr);
        Arrays.sort(arr,new Comparator<Cars>(){
            @Override
            public int compare(Cars o1,Cars o2){
                return o1.price-o2.price;
            }
        });
        Arrays.sort(arr,new Comparator<Cars>(){
            @Override
            public int compare(Cars o1,Cars o2){
                return o1.speed-o2.speed;
            }
        });
        display(arr);
    }
    public static <t extends Comparable<t>> void bubble(t[] arr) {
        boolean swapped=false;
        for (int i= 0; i< arr.length -1;i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j].compareTo(arr[j+1])>0){
                    t temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    public static void display(Cars[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
//interface==> 2 types ==> comparator and comparable