package Chapter03Method;

public class TestInterface1 {
    public static void main(String[] args) {

        Volant v = new Angel();
        v.fly();
        ((Angel) v).helpOther();

    }
}

interface Volant{
    int FLY_HEIGHT =1000;
    void fly();
}

interface Honest{
    void helpOther();
}

class Angel implements Volant,Honest{
    public void helpOther(){
        System.out.println("");
    }
    public void fly(){
        System.out.println("fly");
    }
}
