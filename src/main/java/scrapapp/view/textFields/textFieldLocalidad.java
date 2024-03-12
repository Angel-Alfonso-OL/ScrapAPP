
package scrapapp.view.textFields;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class textFieldLocalidad extends JTextField{
    
    public textFieldLocalidad(){
        this.initComponents();
        
    }
    
    
    private void initComponents(){
       
        this.setBounds(680, 25, 90, 25);
        this.setBorder(null);
         this.setBackground(Color.WHITE);
         this.setForeground(Color.BLACK);
         this.setFont(new Font("Arial Narrow", 1, 14));
         this.setHorizontalAlignment(JTextField.CENTER);
    }
}
