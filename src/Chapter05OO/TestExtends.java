package Chapter05OO;

public class TestExtends {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.name="Nosfy";
        stu.height=180;
        stu.rest();

    }
}

class Person{
    String name;
    int height;

    public void rest(){
        System.out.println("Rest Time!");
    }
}

class Student extends Person{
    String major;
    public void study(){
        System.out.println("Study time!");
    }
    public Student(String name,int age,String major){
        this.name=name;
        this.major=major;
        this.height=age;
    }
    public Student(){

    }
}
