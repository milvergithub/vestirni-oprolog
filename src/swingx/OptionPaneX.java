package swingx;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;

/**
 * @author MILVER
 */
public class OptionPaneX extends JOptionPane{
    
    public OptionPaneX(){
        super();
    }
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d=(Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Paint p=new GradientPaint(0, 0, Color.black,this.getWidth(), this.getHeight(), Color.BLUE);
        Shape s=new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30);
        g2d.setPaint(p);
        g2d.fill(s);
    }
}
