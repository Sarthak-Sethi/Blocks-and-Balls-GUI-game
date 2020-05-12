/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package block.balls;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sarthak sethi
 */
public class animate implements Runnable{
BlockBreak bb;
    public animate(BlockBreak blockBreak) {
        bb = blockBreak;
    }
    
    @Override
    public void run() {
        while(true){
            bb.update();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(animate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
