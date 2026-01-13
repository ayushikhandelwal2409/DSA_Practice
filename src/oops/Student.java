package oops;

    class Student {
    String name;
    int age;
    public void Intro_yourSelf(){
        System.out.println("My name is "+this.name+" and my age is "+this.age);
    }
    public void yourSelf(String name){
        System.out.println("My name is "+this.name+" and her name is "+name);
    }
    public static void mentor_name(){
        System.out.println("Mentor name monu bhaiya");
    }
    static {
        System.out.println("I am a in static blocks");
    }
//    public int getAge(){
//        return age;
//    }
//    public void setAge(int age){
//        this.age=age;
//    }
    //when class members age and name is given in private modifier we cannot access them by writing s.name or s.age
    //instead we need to make separate setter and getter methods for them
}
