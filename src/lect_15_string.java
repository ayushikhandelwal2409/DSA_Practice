public class lect_15_string {
    public static void main(String[] args) {
        //inside heap there is string pull/inter pull
        String s1="hello";//in string pull
        String s2="hello";//in string pull
        String s3=new String("hello");//outside string pull but in heap
        String s4=new String("hello");//outside string pull but in heap
        System.out.println(s1==s2);//true(s1 and s2 here are pointing to same address which has value"hello" in stringpull)
        System.out.println(s2==s3);//false(s3 has different address and s2 has diff address )
        System.out.println(s3==s4);//false((s3 has different address and s4 has diff address )
        s1=s1+"bye";
        //s1=s1.concat("bye");
        System.out.println(s1);
    }
}
