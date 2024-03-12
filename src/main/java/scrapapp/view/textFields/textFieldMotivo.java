
package scrapapp.view.textFields;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;




public class textFieldMotivo extends JTextField{
    
    public textFieldMotivo(){
        
        this.initComponents();
        
    }
    
    
      private void initComponents(){
       
        this.setBounds(10, 90, 460, 25);
        this.setBorder(null);
         this.setBackground(Color.WHITE);
         this.setForeground(Color.BLACK);
         this.setFont(new Font("Arial Narrow", 1, 14));
         this.setHorizontalAlignment(JTextField.CENTER);
         
    }
    
}
