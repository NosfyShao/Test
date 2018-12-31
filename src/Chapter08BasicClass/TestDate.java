package Chapter08BasicClass;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        System.out.println(d.getTime());

        Date d2 = new Date();
        System.out.println(d2.getTime());

        System.out.println(d2.after(d));
    }
}
