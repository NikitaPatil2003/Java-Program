import java.applet.Applet;
import java.awt.*;

public class Flag extends Applet
{
    public void paint(Graphics g)
    {
      g.setColor(Color.orange);
      g.fillRect(100,50,170,40);

      g.setColor(Color.white);
      g.fillRect(100,90,170,40);

       g.setColor(Color.blue);
      g.fillOval(160,90,40,40);


      g.setColor(Color.green);
      g.fillRect(100,130,170,40);

      g.setColor(Color.black);
      g.fillRect(90,50,10,290);

      g.setColor(Color.black);
      g.fillRect(50,330,100,35);

      g.setColor(Color.black);
      g.fillRect(30,350,140,40);


    }
}