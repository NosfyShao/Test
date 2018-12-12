package Chapter05OO;

public class TestObject {
    public static void main(String[] args) {

        TestObject to = new TestObject();
        System.out.println(to);
        Person2 n = new Person2("Nosfy",27);
        System.out.println(n);
    }

    public String toString(){
        return "测试Object对象";
    }
}

class Person2{
    String name;
    int age;

    public String toString(){
        return name+" 年龄："+age;
    }

    public Person2(String name,int age){
        this.name=name;
        this.age=age;
    }
}