
package scrapapp.view.panels;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import scrapapp.view.labels.labelGenerico;
import scrapapp.view.textFields.textFieldCantidad;
import scrapapp.view.textFields.textFieldCostoUnitario;
import scrapapp.view.textFields.textFieldDescripcion;
import scrapapp.view.textFields.textFieldLocalidad;
import scrapapp.view.textFields.textFieldMotivo;
import scrapapp.view.textFields.textFieldUnidadMedida;



public class panelCapturaScrap extends JPanel{
    
    static int id = 0;
    
    
    public panelCapturaScrap(){
        this.initComponents();
        id++;
    }
    
    
    private void initComponents(){
         this.setLayout(null);
         this.setBounds(20, 20, 800, 150);
         this.setBackground(Color.LIGHT_GRAY);
         this.setBorder(new LineBorder(Color.BLACK,1));
         this.add(new labelGenerico("No. de Parte:",10,5,80));
        this.add(new labelGenerico("Descripcion:",150,5,80));
        this.add(new textFieldDescripcion());
        this.add(new labelGenerico("Unidad Medida:",485,5,90));
         this.add(new textFieldUnidadMedida());
         this.add(new labelGenerico("Costo Unitario:",580,5,90));
         this.add(new textFieldCostoUnitario());
         this.add(new labelGenerico("Localidad:",680,5,80));
         this.add(new textFieldLocalidad());
         this.add(new labelGenerico("Cantidad Scrap:",680,70,100));
         this.add(new textFieldCantidad());
          this.add(new labelGenerico("Motivo:",10,70,100));
          this.add(new  textFieldMotivo());
         
    }
    
}
