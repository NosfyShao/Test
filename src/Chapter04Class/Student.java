package Chapter04Class;

public class Student {
    int id;
    String name;
    int age;
    Computer comp;

    public static void main(String[] args) {
        Student stu = new Student(); //
        stu.id=666;
        stu.age=18;
        stu.name="Nosfy";

        Computer c1 = new Computer();
        c1.brand="ASUS";
        stu.comp=c1;
        stu.study();
        stu.play();
    }
    void study(){
        System.out.println("努力敲代码ing！"+"我使用的电脑品牌是："+comp.brand);
    }
    void play(){
        System.out.println("我喜欢精灵宝可梦！");
    }
}

class Computer{
    String brand;

}
