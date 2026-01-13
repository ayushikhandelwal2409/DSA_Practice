package day_2;

class Person {
    String name;
    int height;
    int age;

    public Person(String name ,int height,int age){
        this.name=name;
        this.height=height;
        this.age=age;
    }
    @Override
    public String toString() {
        return "{name='" + name + ", height=" + height + ", age=" + age + '}';
    }
}
