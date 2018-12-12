package Chapter04Class;

class Point{
    double x;
    double y;
    public Point(double x,double y){
        this.x=x;//this表示创建好的对象
        this.y=y;
    }

    public double getDistance(Point p){
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }
}

public class TestConstructor {
    public static void main(String[] args) {
        Point p = new Point(3.0,4.0);
        Point n = new Point(0.0,0.0);
        System.out.println(p.getDistance(n));
    }
}
