package linked_list;

import java.util.ArrayList;

public class reorder_linkedlist {
    public static void main(String[] args) {
        String input_line="1->2->3->4->5";
        System.out.println(reorder(input_line));
    }
    public static String reorder(String s){
        ArrayList<Character> l=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='1' && s.charAt(i)<='9') l.add(s.charAt(i));
        }
        int k=(l.size()/2)+1;
        char[] a=new char[k];
        for (int i = 0; i < k; i++) {
            a[i]=l.get(i);
        }
        int k1=l.size()-k;//5-3=2
        int len=l.size()-1;
        char[] r=new char[k1];
        for (int i = 0; i < k1; i++) {
            r[i]=l.get(len);
            len--;
        }
        String ans="";
        int p=k1;
        int i=0;
        int j=0;
        while(p>0){
            ans+=a[i]+"->"+r[j]+"->";
            i++;
            j++;
            p--;
        }
        while (i<k){
            ans+=a[i]+"->";
            i++;
        }
        return ans.substring(0,ans.length()-2);

    }
}
