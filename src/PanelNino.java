
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author MILVER
 */
public class PanelNino extends JPanel{
    private ImageIcon image=null;
    public PanelNino(){
        image = new ImageIcon(getClass().getResource("/img/fisico_desnudo_descalzo.png"));
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
    public void actualizarImage(String img){
       ImageIcon icono=new ImageIcon(getClass().getResource("/img/"+img));
        this.image=icono;
    }
    private ImageIcon getImagen(){
        return image;
    }
}
