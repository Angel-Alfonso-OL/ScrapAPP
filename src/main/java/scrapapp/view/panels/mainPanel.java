
package scrapapp.view.panels;

import java.awt.Color;
import javax.swing.JPanel;
import scrapapp.view.labels.labelDate;
import scrapapp.view.labels.labelNoEmpleado;
import scrapapp.view.labels.labelNoOrden;
import scrapapp.view.labels.labelTime;
import scrapapp.view.textFields.textFieldNoEmpleado;
import scrapapp.view.textFields.textFieldNoOrden;

public class mainPanel extends JPanel {
    
    private Thread hiloTime;
    
        public mainPanel(){
            this.initComponents();
         }
    
        private void initComponents(){
            this.setBackground(new Color(170, 161, 151));
            this.setLayout(null);
            this.add(new labelDate());
            labelTime time = new labelTime();
            this.add(time);
            hiloTime = new Thread(time);
            hiloTime.start();
            this.add(new labelNoEmpleado());
            this.add(new labelNoOrden());
            this.add(new textFieldNoEmpleado());
            this.add(new textFieldNoOrden());
            
        }
    
}
