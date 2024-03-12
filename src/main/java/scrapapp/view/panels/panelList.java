
package scrapapp.view.panels;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;



public class panelList extends JPanel {
    
    public panelList(){
        this.setLayout(null);
        this.initComponents();
        
    }
    
    private void initComponents(){
         this.setPreferredSize(new Dimension(900,450));
         this.setBackground(Color.GRAY);
         this.add(new panelCapturaScrap());
         
        
    }
    
}
