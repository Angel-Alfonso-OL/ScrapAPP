
package scrapapp.view.textFields;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;



public class textFieldNoEmpleado extends JTextField implements KeyListener{
    
    public boolean Verificacion;
    
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
         this.addKeyListener(this);
          
    }

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        this.setBorder(new LineBorder(Color.GREEN,1));
       //this.setText(""+e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }


    
}
