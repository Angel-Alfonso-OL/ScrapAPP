
package scrapapp.view.textFields;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class textFieldUnidadMedida extends JTextField{
    
    public textFieldUnidadMedida(){
        this.initComponents();
    }
    
     private void initComponents(){
        this.setEditable(false);
        this.setText("EA");
        this.setBounds(650, 25, 80, 25);
        this.setBorder(new LineBorder(Color.BLACK,1));
         this.setBackground(Color.WHITE);
         this.setForeground(Color.BLACK);
         this.setFont(new Font("Arial Narrow", 1, 14));
         this.setHorizontalAlignment(JTextField.CENTER);
    }
}
