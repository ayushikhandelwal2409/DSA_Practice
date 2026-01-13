package oops;

public class exception {
    private String name="kaju";
    private int age=20;
    public exception(String name,int age){
        this.name=name;
        this.age=age;
    }
    public int getAge(){
        return age;
    }


//    public void setAge(int age) throws Exception {
//        if(age<0){
//            throw new Exception("age cannot be negative");
//        }
//        this.age=age;
//    }


    public void setAge(int age) throws Exception {
        try{
            if(age<0){
                throw new Exception("age cannot be negative");
            }
            this.age=age;
        }
        catch (Exception e){
            e.printStackTrace();
        }
//        finally {
//             System.out.println("i am in finaly blocks");
//            //System.exit(0); or 1
//        }
    }
}
//The "throw" keyword generates an exception.
//The "throws" keyword indicates that an exception may occur in the method, and it will be handled by the caller of the method.
