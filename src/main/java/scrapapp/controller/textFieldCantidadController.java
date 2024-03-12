
package scrapapp.controller;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import scrapapp.view.textFields.textFieldCantidad;


public class textFieldCantidadController implements KeyListener{
    
        private final textFieldCantidad textField;
     
         public  textFieldCantidadController(textFieldCantidad textField){
             this.textField = textField;
         }
         
         private boolean validarFormato(String texto){
        
            if(texto == null)return false;
            if(texto.length() == 0)return false;


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
        
        if(!(this.validarFormato(textField.getText()))){
            textField.setBackground(new Color(255,104,0));
            textField.validado = false;
        }else{
            textField.validado = true;
            textField.setBackground(Color.WHITE);
        }
        
    }
    
    
}
