
package scrapapp.view.labels;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;


public class labelNoEmpleado extends JLabel {
    
    public labelNoEmpleado(){
        this.initComponets();
    }
    
     private void initComponets(){
            this.setFont(new Font("Arial Narrow", 1, 14));
            this.setForeground(new Color(0, 0, 0));
            this.setBounds(50, 20, 100, 25);
            this.setText("No. de Empelado:");
        }
    
}
