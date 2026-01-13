package faltu;

import java.util.ArrayList;
import java.util.Scanner;

public class additon_ques {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int n= in.nextInt();
        int[] arr1= new int[n];
        for (int i = 0; i <n ; i++) {
            arr1[i]=in.nextInt();
        }
        int m=in.nextInt();
        int[] arr2= new int[m];
        for (int i = 0; i <m ; i++) {
            arr2[i]=in.nextInt();
        }
        int i=n-1;
        int j=m-1;
        int carry=0;
        while(i>=0 && j>=0){
            int val1=arr1[i];
            int val2=arr2[j];
            int re=(val1+val2+carry)%10;
            list.add(re);
            carry=(val1+val2+carry)/10;
            i--;
            j--;
        }
        while (i>=0){
            int sum=arr1[i]+carry;
            list.add(sum%10);
            carry=sum/10;
            i--;
        }
        while(j>=0) {
            int sum=arr1[j]+carry;
            list.add(sum%10);
            carry=sum/10;
            j--;
        }
        list.reversed();
        for (int k = 0; k < list.size(); k++) {
            if(k==(list.size()-1)){
                System.out.print(list.get(k)+ " END");
            }
            else{
                System.out.print(list.get(k)+ ",");
            }
        }
    }
}
