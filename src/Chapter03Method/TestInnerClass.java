package Chapter03Method;

public class TestInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //创建内部类对象
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}

class Outer {
    private int age =10;

    public void testOuter(){
        System.out.println();
    }

    class  Inner{
        int age = 20;//普通内部类里面不能加static

        //内部类定义在外部类里面可以直接访问外部类成员
        public void show(){
            int age=30;
            System.out.println("外部类的成员变量age："+Outer.this.age);
            System.out.println("内部类的成员变量age："+this.age);
            System.out.println("局部变量age："+age);
        }
    }
}
