
package scrapapp.view.panels;

import java.awt.Color;
import javax.swing.JPanel;
import scrapapp.view.labels.labelDate;
import scrapapp.view.labels.labelGenerico;
import scrapapp.view.labels.labelTime;
import scrapapp.view.scrollPane.scrollPaneList;
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
            this.add(new labelGenerico("No. de Empelado:",50,20,100));
            this.add(new labelGenerico("No. de Orden:",50,55,100));
            this.add(new textFieldNoEmpleado());
            this.add(new textFieldNoOrden());
            this.add(new scrollPaneList());
         
            
        }
    
}
