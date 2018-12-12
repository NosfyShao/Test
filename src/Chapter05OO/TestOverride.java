package Chapter05OO;

public class TestOverride {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.run();
    }
}

class  Vehicle{
    public void run(){
        System.out.println("跑");
    }
    public void stop(){
        System.out.println("停");
    }

    public Person passanger(){
        return new Person();
    }
}

class Horse extends Vehicle{
    public void run(){
        System.out.println("跑跑停停");
    }
    public Student passanger(){//返回值类型小于等于父类的类型
        return new Student();
    }
}
