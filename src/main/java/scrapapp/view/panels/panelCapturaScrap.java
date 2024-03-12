
package scrapapp.view.panels;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import scrapapp.view.labels.labelGenerico;
import scrapapp.view.textFields.textFieldDescripcion;
import scrapapp.view.textFields.textFieldUnidadMedida;



public class panelCapturaScrap extends JPanel{
    
    static int id = 0;
    
    
    public panelCapturaScrap(){
        this.initComponents();
        id++;
    }
    
    
    private void initComponents(){
         this.setLayout(null);
         this.setBounds(20, 20, 800, 120);
         this.setBackground(Color.LIGHT_GRAY);
         this.setBorder(new LineBorder(Color.BLACK,1));
         this.add(new labelGenerico("No. de Parte:",10,5,80));
        this.add(new labelGenerico("Descripcion:",200,5,80));
        this.add(new textFieldDescripcion());
        this.add(new labelGenerico("Unidad Medida:",650,5,100));
         this.add(new textFieldUnidadMedida());
    }
    
}
