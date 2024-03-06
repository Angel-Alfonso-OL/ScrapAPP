
package scrapapp.view.panels;

import java.awt.Color;
import javax.swing.JPanel;
import scrapapp.view.labels.labelDate;

public class mainPanel extends JPanel {
    
        public mainPanel(){
            this.initComponents();
         }
    
        private void initComponents(){
            this.setBackground(new Color(170, 161, 151));
            this.setLayout(null);
            this.add(new labelDate());
        }
    
}
