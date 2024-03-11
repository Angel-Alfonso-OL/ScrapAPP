
package scrapapp.view.panels;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class panelCapturaScrap extends JPanel{
    
    public panelCapturaScrap(){
        this.initComponents();
    }
    
    
    private void initComponents(){
         this.setBounds(20, 20, 800, 100);
         this.setBackground(Color.LIGHT_GRAY);
         this.setBorder(new LineBorder(Color.BLACK,1));
    }
    
}
