
package scrapapp.view.textFields;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;



public class textFieldCostoUnitario extends JTextField{
    
    public textFieldCostoUnitario(){
        this.initComponents();
        
    }
    
    private void initComponents(){
        this.setEditable(false);
        this.setText("$20.685");
        this.setBounds(580, 25, 75, 25);
        this.setBorder(null);
         this.setBackground(Color.WHITE);
         this.setForeground(Color.BLACK);
         this.setFont(new Font("Arial Narrow", 1, 14));
         this.setHorizontalAlignment(JTextField.CENTER);
    }
    
}
