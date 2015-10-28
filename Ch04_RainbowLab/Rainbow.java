// Chapter 5 Question 27

// Ken Zheng

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel
{
  // Declare skyColor:
  private final Color skyColor;

	
  public Rainbow() {
	skyColor = Color.CYAN;
    setBackground(skyColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();

    // Declare and initialize local int variables xCenter, yCenter
    // that represent the center of the rainbow rings:

    int xCenter = width/2;
    int yCenter = 3*height/4;
    
    System.out.println(width);
    // Declare and initialize the radius of the large semicircle:
    
    int largeRadius = width/2;
    int smallRadius = width/4;
    
    //NOT USING THE SQRT FUNCTION, JUST AVERAGING THE LARGE AND SMALL RADIUS TO GET THE CENTER RADIUS
    //int medRadius = (int)Math.sqrt(largeRadius*smallRadius);
    
    int medRadius = (int)((largeRadius+smallRadius)/2);
    
    int lastRadius = smallRadius-(largeRadius-medRadius);
    
    
    g.setColor(Color.RED);    
    g.fillArc(xCenter-largeRadius/2, yCenter-largeRadius/2, largeRadius, largeRadius, 0, 180);

    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:


    g.setColor(Color.GREEN);
    g.fillArc(xCenter-medRadius/2, yCenter-medRadius/2, medRadius, medRadius, 0, 180);
    
    
    g.setColor(Color.MAGENTA);
    
    g.fillArc(xCenter-smallRadius/2, yCenter-smallRadius/2, smallRadius, smallRadius, 0, 180);
    
    
    g.setColor(Color.CYAN);
    g.fillArc(xCenter-lastRadius/2, yCenter-lastRadius/2+1, lastRadius, lastRadius, 0, 180);
    //+1 is to remove line at the bottom
    
    //Clouds :)
    g.setColor(Color.WHITE);
    g.fillArc(0,0,40,40,0,360);
    g.fillArc(20,0,40,40,0,360);
    g.fillArc(40,0,40,40,0,360);
    g.fillArc(60,0,40,40,0,360);

    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings:
    // ________________________________________________

    // Draw the sky-color semicircle:
    // ________________________________________________
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
