
package scrapapp.view.textFields;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import scrapapp.controller.textFieldCantidadController;


public class textFieldCantidad extends JTextField{
    
    public boolean validado = false;
    
    public textFieldCantidad(){
        
        this.initComponents();
        
    }
    
    
      private void initComponents(){
       this.setText("0");
        this.setBounds(680, 90, 90, 25);
        this.setBorder(null);
         this.setBackground(Color.WHITE);
         this.setForeground(Color.BLACK);
         this.setFont(new Font("Arial Narrow", 1, 14));
         this.setHorizontalAlignment(JTextField.CENTER);
         this.addKeyListener(new textFieldCantidadController(this));
    }
}
