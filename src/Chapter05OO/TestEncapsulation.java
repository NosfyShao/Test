package Chapter05OO;

public class TestEncapsulation {
    public static void main(String[] args) {
        Human h = new Human();
        h.name="Nosfy";
    }
}

class Human{
    private int age;
    String name;
    void sayAge(){
        System.out.println(age);
    }
}

class Boy extends Human{
    void sayHello(){
        System.out.println();
    }
}
