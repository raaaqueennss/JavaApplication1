
package pboteori;
import java.awt.Color;
import java.awt.Graphics;
public class Animasi_Lingkaran extends java.applet.Applet implements Runnable {

    Thread runner;
    int xpos;
    int ypos;
    int ux1, ux2;

    public void start() {
        if (runner == null) {
            runner = new Thread(this);
            runner.start();
        }
    }

    public void stop() {
        if (runner != null) {
            runner.stop();
            runner = null;
        }
    }

public void run() {
    setBackground(Color.blue);
        while (true) {
            /* bergerak ke kanan */
            for (xpos = 5; xpos <= 105; xpos += 4) {
                ux2 = xpos + 90;
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (ux1 == 0)
                    ux1 = xpos;
            }

            /* bergerak ke bawah */
            for (ypos = 5; ypos <= 105; ypos += 4) {
                ux1 = xpos;
                ux2 = xpos + 90;
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            /* bergerak ke kiri */
            for (xpos = 105; xpos > 5; xpos -= 4) {
                ux1 = xpos;
                ux2 = xpos + 90;
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            /* bergerak ke atas */
            for (ypos = 105; ypos > 5; ypos -= 4) {
                ux1 = xpos;
                ux2 = xpos + 90;
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        // Draw black background
        g.setColor(Color.black);
        g.fillRect(0, 0, 200, 200);

        // Draw white background
        g.setColor(Color.white);
        g.fillRect(100, 0, 100, 200);

        // Draw red circle
        g.setColor(Color.red);
        g.fillOval(xpos, ypos, 90, 90);

        // reset the drawing area
        ux1 = ux2 = 0;
    }
}
    

