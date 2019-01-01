package Chapter08BasicClass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
    public static void main(String[] args) {

        //把时间对象按照“格式字符串指定格式”转成响应的字符串
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str=df.format(new Date(400000000));
        System.out.println(str);

        //把字符串按照“格式字符串指定的格式”转成响应的实践对象
        DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        String strT = "1985年12月31日 12时31分06秒";
        Date date = null;
        try {
            date = df2.parse(strT);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);

        //测试其他的格式字符
        DateFormat df3 = new SimpleDateFormat("D");
        String str3 = df3.format(new Date());
        System.out.println(str3);
        ;
    }
}
