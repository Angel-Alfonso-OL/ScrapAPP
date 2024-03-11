
package scrapapp.view.textFields;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import scrapapp.controller.textFieldNoEmpleadoController;


public class textFieldNoEmpleado extends JTextField{
    
    public boolean validado = false;

    public textFieldNoEmpleado(){
        this.initComponets();
    }
    
    private void initComponets(){
         this.setBackground(Color.WHITE);
         this.setForeground(Color.BLACK);
         this.setFont(new Font("Arial Narrow", 1, 14));
         this.setBounds(150, 20, 100, 25);
         this.setHorizontalAlignment(JTextField.CENTER);
         this.setBorder(new LineBorder(Color.BLACK,1));
         this.addKeyListener(new textFieldNoEmpleadoController(this));   
    }
    
}
