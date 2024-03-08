
package scrapapp.view.panels;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;


public class panelList extends JPanel {
    
    public panelList(){
        this.initComponents();
        this.setPreferredSize(new Dimension(900,800));
        
    }
    
    private void initComponents(){
        
        this.setBackground(Color.GRAY);
        
    }
    
}
