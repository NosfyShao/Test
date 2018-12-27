package Chapter07Arrays;

public class TestArray2 {
    public static void main(String[] args) {
        //静态初始化
        int[] a ={1,2,3,4,4,6};
        User[] b = {
                new User(1001,"Nosfy"),
                new User(1002,"Nosfy2"),
                new User(1003,"Nosfy3")
        };
        int[] c=new int[3];//默认初始化,默认的值和成员变量赋值原则一样
        //通过下标进行赋值就是动态初始化，就是那个for循环赋值
        for (int i=0;i<b.length;i++){
            System.out.println(b[i].getId()+b[i].getName());
        }
        System.out.println("############################");
        for (User m:b){
            System.out.println(m);
        }
        int[]d=new int[b.length];
        for (int i=0;i<b.length;i++){
            d[i]=b[i].getId();
        }
        for (int n:d){
            System.out.println(n);
        }
    }
}

class User {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    User(int id, String name){
        this.id=id;
        this.name=name;
        System.out.println("id:"+id+" name:"+name);
    }
}
