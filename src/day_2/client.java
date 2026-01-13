package day_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class client{
    public static void main(String[] args) {
        Comparator<Person> com=new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if(p1.age>p2.age) return 1;
                else if(p1.age<p2.age) return -1;
                else{
                    if(p1.height>p2.height) return 1;
                    else if(p1.height<p2.height) return -1;
                    else{
                        return p1.name.compareTo(p2.name);
                    }
                }
            }
        };
        ArrayList<Person> ll=new ArrayList<>();
        ll.add(new Person("ayushi",420,20));
        ll.add(new Person("akshita",420,20));
        ll.add(new Person("gopu",520,14));
        ll.add(new Person("falguni",411,24));
        Collections.sort(ll,com);
        System.out.println(ll);
    }

}
