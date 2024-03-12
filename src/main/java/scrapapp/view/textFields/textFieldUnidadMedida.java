
package scrapapp.view.textFields;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;


public class textFieldUnidadMedida extends JTextField{
    
    public textFieldUnidadMedida(){
        this.initComponents();
    }
    
     private void initComponents(){
        this.setEditable(false);
        this.setText("EA");
        this.setBounds(485, 25, 80, 25);
        this.setBorder(null);
         this.setBackground(Color.WHITE);
         this.setForeground(Color.BLACK);
         this.setFont(new Font("Arial Narrow", 1, 14));
         this.setHorizontalAlignment(JTextField.CENTER);
    }
}
