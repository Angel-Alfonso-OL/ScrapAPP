
package scrapapp.view.labels;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import javax.swing.JLabel;


public class labelDate extends JLabel{
    
    final int DAY = LocalDate.now().getDayOfMonth();
    final String MONTH = this.conversionMonth(LocalDate.now().getMonth().toString());
    final int YEAR = LocalDate.now().getYear();
    
    public labelDate(){
        this.initComponents();
    }
    
    private void initComponents(){
        this.setText(this.DAY + " de " + this.MONTH + " del " + this.YEAR);
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
