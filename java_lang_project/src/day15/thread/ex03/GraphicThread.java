package day15.thread.ex03;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/*
    상속된 클래스일 경우 Runnable 인터페이스를 inplements 해서 스레스를 사용한다.
 */
public class GraphicThread extends JFrame implements Runnable {

    int num;
    int x;
    int y;
    Color color;
    Random random;

    public GraphicThread(int num){
        this.num = num;
        color = Color.red;
        random = new Random();
        setSize(500,500);   // 프레임(화면) 크기 지정
        setVisible(true);               // 화면에 보여주기
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // 닫기
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x,y,3,3);
        //g.fillOval(x,y,10,10);

    }

    @Override
    public void run() {
        Rectangle rect = getBounds();

        for(int i=0;i<num;i++){
            x=random.nextInt(rect.width);
            y=random.nextInt(rect.height);

            repaint();

            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }


    }
}
