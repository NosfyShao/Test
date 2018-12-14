package Chapter03Method;

//接口是比抽象类更抽象的抽象类，里面不能有普通实现，里面所有的方法都是抽象方法
//接口只定义规范，不定义具体的实现
//java类只能单继承，但是接口可以多继承，接口不能定义变量，所以只能定义常量和抽象方法
public interface TestInterface {
    int MAX_AGE = 100;//相当于默认是public static final

    void test01();//相当于默认是public abstract void test01();


    //子类通过implants来实现接口

}

class MyClass implements TestInterface{
    public void test01(){
        System.out.println(MAX_AGE);
        System.out.println("重写 抽象类");
    }
}
