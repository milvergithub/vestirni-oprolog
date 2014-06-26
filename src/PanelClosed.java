
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author MILVER
 */
public class PanelClosed extends JPanel{
    private ImageIcon image=null;
    public PanelClosed(){
        image = new ImageIcon(getClass().getResource("/img/fondoclosed.png"));
    }
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d=(Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Dimension height = getSize(); 
        g2d.drawImage(getImagen().getImage(), 0, 0, height.width, height.height, null);
        setOpaque(false);
        super.paintComponent(g2d);
    }
    private ImageIcon getImagen(){
        return image;
    }
}
