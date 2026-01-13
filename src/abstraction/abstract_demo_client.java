package abstraction;

public class abstract_demo_client {
    public static void main(String[] args) {
        abstract_demo ab1=new abstract_demo() {
            public void payOnline(){

            }
        };
        abstract_demo ab2=new abstract_demo_2() {
            public void payOnline(){

            }
        };
    }
}
//we  cannot make object of abstract class
//abstract_demo ab=new abstract_demo() {
//        ab.payOnline();
//it will give error