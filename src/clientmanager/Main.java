
package clientmanager;

import java.util.logging.Level;
import java.util.logging.Logger;
public class Main {

    public static void main(String[] args) {
        LaunchProgressBar lp = new LaunchProgressBar();
        lp.setVisible(true);
        for(int i=0;i<=100;i++){
            try {
                lp.getProgressBar().setValue(i);
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                Logger.getLogger(LaunchProgressBar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        lp.dispose();
        Login jFl = new Login(null, true);
        jFl.setVisible(true);
    }
}
