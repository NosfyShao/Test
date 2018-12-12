package Chapter04Class;

public class TestThis {
    int a,b,c;

    TestThis(int a,int b){
        this.a=a;
        this.b=b;
    }
    TestThis(int a,int b,int c){
        this(a, b); //构造器的调用必须位于第一句。
        this.c = c;
    }
}
