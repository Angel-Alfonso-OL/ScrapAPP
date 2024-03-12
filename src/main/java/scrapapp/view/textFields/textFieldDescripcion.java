
package scrapapp.view.textFields;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class textFieldDescripcion extends JTextField{
    
    public textFieldDescripcion(){
        this.initComponents();
    }
    
    private void initComponents(){
        this.setEditable(false);
        this.setText("TWECOTONG HANDLE SCREW");
        this.setBounds(150, 25, 320, 25);
        this.setBorder(null);
         this.setBackground(Color.WHITE);
         this.setForeground(Color.BLACK);
         this.setFont(new Font("Arial Narrow", 1, 14));
         this.setHorizontalAlignment(JTextField.CENTER);
    }
    
}
