import java.applet.Applet;
import java.awt.*;
public class humanf extends Applet
{
public void paint(Graphics g)
{

g.drawOval(40,40,200,200);
g.setColor(Color.yellow);
g.fillOval(40,40,200,200);

g.setColor(Color.black);
g.drawOval(80,80,40,60);
g.setColor(Color.white);
g.fillOval(80,80,40,60);

g.setColor(Color.black);
g.drawOval(160,80,40,60);
g.setColor(Color.white);
g.fillOval(160,80,40,60);

g.setColor(Color.black);
g.fillOval(100,100,20,30);

g.setColor(Color.black);
g.fillOval(180,100,20,30);

g.drawArc(90,140,100,50,180,180);
g.drawArc(125,160,35,60,180,180);
g.setColor(Color.red);
g.fillArc(125,160,35,60,180,180);
}
}
