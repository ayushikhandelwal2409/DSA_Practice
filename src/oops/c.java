package oops;

public class c extends p { // here p is parent class and c is child class
    int d=2;
    int d2=20;
    @Override    // runtime polymorphism
    public void fun(){
        System.out.println("fun in c");
    }
    public void fun2(){
        System.out.println("fun2 in c");
    }
}
//child has right on parent property
//parents do not have right on the child's property
//p obj=new p();
//p obj=new c();

//multilevel inheritance
//multiple inheritance achieved using interface
//whenever we print object reference variable it runs toString method of object class.