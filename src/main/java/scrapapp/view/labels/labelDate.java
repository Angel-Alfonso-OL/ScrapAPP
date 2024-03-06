
package view.labels;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.JLabel;


public class labelDate extends JLabel{
    
    public labelDate(){
        this.conf();
    }
    
    private void conf(){
        this.setText(LocalDate.now().getDayOfMonth() + " de " + this.conversionMonth(LocalDate.now().getMonth().toString()) + " del " + LocalDate.now().getYear());
        this.setFont(new Font("Arial Narrow", Font.ITALIC + Font.BOLD, 15));
        this.setForeground(new Color(0, 0, 0));
        this.setBounds(830, 10, 130, 50);
        
    }
    
    private String conversionMonth(String mesIngles){
        
        return switch (mesIngles) {
            case ("JANUARY") -> "Enero";
            case ("FEBRUARY") -> "Febrero";
            case ("MARCH") -> "Marzo";
            case ("APRIL") -> "Abril";
            case ("MAY") -> "Mayo";
            case ("JUNE") -> "Junio";
            case ("JULY") -> "Julio";
            case ("AUGUST") -> "Agosto";
            case ("SEPTEMBER") -> "Septiembre";
            case ("OCTOBER") -> "Octubre";
            case ("NOVEMBER") -> "Noviembre";
            case ("DECEMBER") -> "Diciembre";
            default -> "No Valido";
        };
                
        
    }
    
    
}
