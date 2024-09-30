import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class ImageCrop1 extends Applet implements Runnable{

    Thread runner;
    int xpos;
    int ux1, ux2;

    public void start(){
        if (runner == null); {
            runner = new Thread(this);
            runner.start();

        }
    }
    public void stop(){
        if (runner != null);
            runner.stop();
            runner = null;

    }

    public void run(){

        setBackground (Color.blue);

        while (true){

            //bergerak ke kanan
            for (xpos= 5; xpos <= 105; xpos+=4) {
                ux2 = xpos + 90;
                repaint();
                try { Thread.sleep(100); }
                catch (InterruptedException e) { }
                if (ux1 == 0) ux1 = xpos;
            }
            //bergerak ke kiri
            for (xpos = 105; xpos > 5; xpos -=4) {
                ux1 = xpos;
                repaint ();
                try { Thread.sleep(100); }
                catch (InterruptedException e) {}
                if (ux2 == 0) ux2 = xpos + 90 ;
            }
        
        }
    }
    public void update (Graphics g) {
        g.clipRect (ux1, 5, ux2 - ux1, 95);
        paint(g);
    }

    public void paint (Graphics g) {

        // Draw black background
        g.setColor(Color.yellow);
        g.fillRect(0,0,100,100);

        // Draw white background
        g.setColor(Color.white);
        g.fillRect(100,0,100,100);
        
        // Draw checker / red circle
        g.setColor(Color.pink);
        g.fillOval (xpos, 5,90,90);
        
        // reset the drawing area
        ux1 = ux2 = 0;
        
        }
}