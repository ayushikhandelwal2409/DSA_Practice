package oops;

public class oops_intro {
    public static void main(String[] args) throws Exception{
        Student s=new Student();
        System. out.println(s.name);
        System.out.println(s.age);
        s.Intro_yourSelf();


        Student s1=new Student();
        s1.name="Kamlesh";
        s1.age=17;
        s1.Intro_yourSelf();
        s.yourSelf("ayushi");


        s1.mentor_name();//example of static
        Student.mentor_name();//example of static :we can access static obj using class name.


        exception s2=new exception("ayu",19);
        System.out.println(s2.getAge());
        s2.setAge(-9);
        System.out.println(s2.getAge());
        System.out.println("hey");
    }
    static {
        System.out.println("I am a in static blocks main");
    }
}
//"this": it is used when function ka argument name is same as the class member name
//null
//0
//My name is null and my age is 0
//My name is Kamlesh and my age is 17
//My name is Kamlesh and her name is ayushi
