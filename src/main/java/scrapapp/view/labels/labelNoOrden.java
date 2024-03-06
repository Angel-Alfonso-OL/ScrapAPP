package scrapapp.view.labels;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;


public class labelNoOrden extends JLabel {
    
    public labelNoOrden(){
        this.initComponets();
    }
    
     private void initComponets(){
            this.setFont(new Font("Arial Narrow", 1, 14));
            this.setForeground(new Color(0, 0, 0));
            this.setBounds(50, 40, 100, 50);
            this.setText("No. de Orden:");
        }
    
}
