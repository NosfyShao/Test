package Chapter03Method;

public class TestInterface2 {
}

interface A{
    void testA();
}

interface B{
    void testB();
}

interface C extends A,B{
    void testC();
}

class MyTestClass implements C{
    @Override
    public void testA() {

    }

    @Override
    public void testB() {

    }

    @Override
    public void testC() {

    }
}
