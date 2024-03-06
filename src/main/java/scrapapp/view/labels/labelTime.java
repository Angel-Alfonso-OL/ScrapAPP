
package scrapapp.view.labels;

import java.awt.Color;
import java.awt.Font;
import static java.lang.Thread.sleep;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;



public class labelTime extends JLabel implements Runnable{
   
        public labelTime(){
           this.conf();
        }
    
        private void conf(){
            this.setFont(new Font("Arial Narrow", 1, 14));
            this.setForeground(new Color(0, 0, 0));
            this.setBounds(830, 40, 80, 50);
        }

    @Override
    public void run() {
        while(true){
            this.setText(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss a")));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
        }
    }
}
