import java.applet.Applet;
import java.awt.*;

public class Applet_program extends Applet
{
    public void paint(Graphics g)
    {
      g.setColor(Color.orange);
      g.fillRect(60,40,80,80);

      g.setColor(Color.pink);
      g.fillOval(150,40,80,80);

       g.setColor(Color.blue);
      g.fillRect(250,40,100,70);

      g.setColor(Color.yellow);
      g.fillOval(380,40,80,60);
    }
}