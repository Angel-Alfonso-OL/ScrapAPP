
package scrapapp.view;

import javax.swing.JFrame;
import java.awt.Toolkit;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;



public class frameMain extends JFrame{
    
        public frameMain(){
            this.initComponents();
        }

        private void initComponents(){
            this.setTitle("ScrapAPP");
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setResizable(false);
            this.setSize(1000, 750);
            this.setVisible(true);
            this.setLocation(((Toolkit.getDefaultToolkit().getScreenSize().width - 1000) / 2), 30);  
           // this.add(new panelPrincipal());
        }    
}
