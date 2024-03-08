
package scrapapp.view.scrollPane;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import scrapapp.view.panels.panelList;

public class scrollPaneList extends JScrollPane{
    
    public scrollPaneList(){
        this.initComponent();
    }
    
    private void initComponent(){
        //this.setBorder(new LineBorder(Color.BLACK,1));
        this.setBounds(50, 120, 900, 450);
        this.setBackground(Color.GRAY);
        this.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
       this.setBorder(new LineBorder(Color.BLACK,1));
        this.setViewportView(new panelList());
        this.getVerticalScrollBar().setUnitIncrement(10);

        
    }
    
}
