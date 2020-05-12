/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package block.balls;

import javax.swing.JFrame;

public class BlockBalls {

    public static void main(String[] args) {
     JFrame frame = new JFrame("Block and Balls");
     BlockBreak blockBreakpanel = new BlockBreak();
     frame.getContentPane().add(blockBreakpanel);
     frame.setVisible(true);
     frame.setSize(1920, 1080);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
