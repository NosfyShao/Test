package Chapter13Game;

//游戏主窗

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGameFrame extends JFrame{
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Color c = g.getColor();

        g.setColor(Color.blue);
        g.drawLine(100,100,400,400);
        g.setColor(c);
    }

    //##############################################
    public void launchFrame(){
        this.setTitle("雷电");
        this.setVisible(true);
        this.setSize(500,500);
        this.setLocation(500,500);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        MyGameFrame f = new MyGameFrame();
        f.launchFrame();
    }


}
