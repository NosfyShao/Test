package Chapter13Game;

//游戏主窗

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGameFrame extends JFrame{
    Image planeImg = GameUtil.getImage("images/plane.png");
    Image bg = GameUtil.getImage("images/bg.png");

    Plane plane = new Plane(planeImg,250,250);
    Shell[] shells= new Shell[3];

    Explode bao;

    int planeX=250;
    int planeY=250;
    @Override
    public void paint(Graphics g) {

        g.drawImage(bg,0,0,null);
        plane.drawSelf(g);
        for (int i=0;i<shells.length;i++){
            shells[i].draw(g);
            boolean peng = shells[i].getRect().intersects(plane.getRect());
            if (peng){
                System.out.println("相撞了！！！");
                plane.alive=false;
                if (bao==null){
                    bao=new Explode(plane.x,plane.y);
                }
                bao.draw(g);

            }
        }

    }
    //###############################################
    class PaintThread extends Thread{
        public void run(){
            while (true){
                System.out.println("窗口画一次");
                repaint();;

                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //####################################################
    //键盘监听类
    class KeyMonitor extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            plane.addDirection(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            plane.minusDirection(e);
        }
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

        new PaintThread().start();//启动重画窗口的线程
        addKeyListener(new KeyMonitor()); //增加键盘监听

        for(int i=0;i<shells.length;i++){
            shells[i] = new Shell();
        }
    }

    public static void main(String[] args) {
        MyGameFrame f = new MyGameFrame();
        f.launchFrame();
    }

    //############################################################
    private Image offScreenImage = null;

    public void update(Graphics g) {
        if(offScreenImage == null)
            offScreenImage = this.createImage(500,500);//这是游戏窗口的宽度和高度

        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);
    }


}
