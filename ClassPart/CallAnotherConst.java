package ClassPart;

class Person {

    public String name;
    public int age;


    public Person() {
        this("이름없음",30);
    }

    public Person returnSelf() {
        return this;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


public class CallAnotherConst {
    public static void main(String[] args) {
        Person p1 = new Person("노상민",30);
        Person p2 = new Person("아이유",30);
        Person p3 = new Person();
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p3.name);
        System.out.println(p1.age);
        System.out.println(p1.returnSelf());
        System.out.println(p2.returnSelf());
        System.out.println(p3.returnSelf());
    }
}
