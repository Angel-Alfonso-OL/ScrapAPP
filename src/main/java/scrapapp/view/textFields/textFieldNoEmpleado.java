
package scrapapp.view.textFields;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class textFieldNoEmpleado extends JTextField implements KeyListener{
    
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
         this.addKeyListener(this);   
    }
    
    private boolean validarFormato(String texto){
        
        if(texto == null)return false;
        if(texto.length() != 5)return false;
        
        for(int i = 0; i < texto.length(); i++){
            if(!(this.validarCaracterNumerico(texto.charAt(i)))) return false;
        }
        
        return true;
    }
    
    private boolean validarCaracterNumerico(char valor){
        
        final char[] NUMEROS = {'0','1','2','3','4','5','6','7','8','9'};
        
        for(int i = 0; i < NUMEROS.length; i++) if(valor == NUMEROS[i]) return true;
        
        return false;
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {
        
        if(!(this.validarFormato(this.getText()))){
            this.setBackground(new Color(255,104,0));
            this.validado = false;
        }else{
            this.validado = true;
            this.setBackground(Color.WHITE);
        }
        
    }
}
