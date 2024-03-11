
package scrapapp.view.textFields;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import scrapapp.controller.textFieldNoOrdenController;


public class textFieldNoOrden extends JTextField {
    
    public boolean validado = true;
    
    public textFieldNoOrden(){
        this.initComponets();
    }
    
    private void initComponets(){
         this.setBackground(Color.WHITE);
         this.setForeground(Color.BLACK);
         this.setFont(new Font("Arial Narrow", 1, 14));
         this.setBounds(150, 55, 100, 25);
         this.setHorizontalAlignment(JTextField.CENTER);
         this.setBorder(new LineBorder(Color.BLACK,1));
         this.setText("NA");
         this.addKeyListener(new textFieldNoOrdenController(this));   
    }
    
}
