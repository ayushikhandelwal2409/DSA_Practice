package day_4;

public class string {
    public static void main(String[] args) {
//1==>    Without Semicolon print - Hello World
         if (System.out.printf("Hello World") == null) {}
        System.out.println();
        System.out.printf("hello%nworld%n");
        System.out.println("bye\nworld");
//Hello World
//hello
//world
//bye
//world


//2==>    Print Name without using vowels..

        // Use ascii values
        System.out.println((char)65+"y"+(char)117+"sh"+(char)105);  //Ayushi

//3==>  use of L for long numbers
        long num1=100*24*12*60*60*60;

               System.out.println("long "+num1); // 1925832704    (X wrong)

        long num2=100*24*12*60*60*60L;
        System.out.println("long "+num2); //6220800000     ( correct)

//4==>    Print numbers without using integer literal
//        if c==0 print b eif c==1 print a

        int a=23;
        int b=324;
        int c=0;
        // :use only arthimetic operator to check if c=0 print b and c=1 print a
        int out=a*(c)+b*(1-c);
        System.out.println(out);//324

    }
}


//5==> primitives in java are char integer and boolean
//==> non-primitives are string array interface class object