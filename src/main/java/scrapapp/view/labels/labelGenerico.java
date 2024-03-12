
package scrapapp.view.labels;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;


public class labelGenerico extends JLabel{
    
    private final String NOMBRE;
    private final int X;
    private final int Y;
    private final int WIDTH;
    
    public labelGenerico(String nombre, int x, int y, int width){
        
        this.NOMBRE = nombre;
        this.X = x;
        this.Y = y;
        this.WIDTH = width;
        
        this.initComponents();
        
    }
    
    private void initComponents(){
        this.setFont(new Font("Arial Narrow", 1, 14));
        this.setForeground(new Color(0, 0, 0));
        this.setBounds(X, Y, WIDTH, 23);
        this.setText(NOMBRE);
    }
    
}
