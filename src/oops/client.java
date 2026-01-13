package oops;

public class client {
    public static void main(String[] args) {


        //case 1==> no inheritance
        System.out.println("case1");
        p obj=new p();
        System.out.println(obj.d);
        System.out.println(obj.d1);
        obj.fun();
        obj.fun1();



        //case 2
        System.out.println("case2");
        p obj1=new c();//child parent ki property use kr rhahai
        System.out.println(obj1.d);
        System.out.println(obj1.d1);
        System.out.println(((c)obj1).d2);
        System.out.println(((c)obj1).d);
        obj1.fun();
        obj1.fun1();
        ((c)obj1).fun2();



         //case 3 ==>cannot do
        System.out.println("case3");
        //c obj2 =new p(); //parent child ki property use kr rha hai that is not possible
//        System.out.println(obj2.d);
//        System.out.println(obj2.d1);
//        System.out.println(obj2.d2);



        // case 4
        System.out.println("case4");
        c obj3 =new c();
        System.out.println(obj3.d);
        System.out.println(obj3.d1);
        System.out.println(obj3.d2);
        obj3.fun();
        obj3.fun1();
        obj3.fun2();
    }
}
