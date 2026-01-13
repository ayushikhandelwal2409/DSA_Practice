package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//comparing and sorting list of string according to length of string
//it works with wrapper classes only (Integer,String etc).
public class comparator {
    public static void main(String[] args) {
        Comparator<String> com=new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length()>s2.length()) return 1;
                return -1;
            }
        };
        //as comparator has functional interface so
        //it can also be written as
        //Comparator<String> com=`(String s1,String s2) -> return s1.length()>s2.length()?1:-1`;
        ArrayList<String> list=new ArrayList<>();
        list.add("ayushi");
        list.add("bhoomika");
        list.add("gopu");
        list.add("shin-hari");
        list.add("eun-bong-hee");
        Collections.sort(list,com);
        System.out.println(list);
    }
}

//[gopu, ayushi, bhoomika, shin-hari, eun-bong-hee]