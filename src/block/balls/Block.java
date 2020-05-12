/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package block.balls;

import java.awt.*;

/**
 *
 * @author sarthak sethi
 */
class Block extends Rectangle{
Image pic;
int xmove = -10;
int ymove = -10;
Rectangle left, right;
boolean destroyed = false;
boolean powerup = false;
    Block(int X, int Y, int W, int H, String s) {
        x=X;
        y=Y;
        width = W;
        height = H;
        pic = Toolkit.getDefaultToolkit().getImage(s);
    }
    public void draw(Graphics g,Component c){
        if(!destroyed)
        g.drawImage(pic,x,y,width,height,c);
        
    }
}
