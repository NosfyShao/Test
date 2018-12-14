package Chapter03Method;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public abstract class Animal {
    //第一，没有实现，第二，子类必须实现
    //抽象类不能够实例化，所以相当于不能使用new，这也代表着，这类只能被继承
    abstract public void shout();

    public void run(){
        System.out.println("跑！");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        //抽象类的意义在于提供模板让子类照着模板来进行设计
    }
}

class Dog extends Animal{
    public void shout(){
        System.out.println("汪汪汪！");//Z子类必须重写，不然就报错，其实属于阉割限定
    }
}
