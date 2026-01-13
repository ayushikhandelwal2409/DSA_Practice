package generics;

import java.util.ArrayList;
import java.util.Collections;


class Student implements Comparable<Student>{
    int age;
    String name;

    public  Student(int age,String name){
            this.age=age;
            this.name=name;
    }
    @Override
    public int compareTo(Student that){
        if(this.age> that.age) return 1; // swap krna
        return -1;// swap nhi krna
    }
    @Override
    public String toString(){
        return age+" "+name;
    }
}


public class comparable {
    public static void main(String[] args) {
        ArrayList<Student> ll=new ArrayList<>();
        ll.add(new Student(13,"gopu"));
        ll.add(new Student(20,"ayushi"));
        ll.add(new Student(24,"falguni"));
        ll.add(new Student(7,"rishika"));
        Collections.sort(ll);
        for(Student i:ll){
            System.out.println(i.toString());
        }

    }
}
