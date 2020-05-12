/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package block.balls;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author sarthak sethi
 */
class BlockBreak extends JPanel implements KeyListener{
    ArrayList<Block> blocks = new ArrayList<>();
      ArrayList<Block> ball = new ArrayList<>();
    Block paddel;
    Thread thread;
    animate animate;
    public BlockBreak() {
        paddel = new Block(900, 950, 150, 25, "paddle.png");
        for(int i=0;i<33;i++){
            blocks.add(new Block((i*60+2),0,60,25,"blue.png"));
        }
         for(int i=0;i<33;i++){
            blocks.add(new Block((i*60+2),25,60,25,"red.png"));
        }
          for(int i=0;i<33;i++){
            blocks.add(new Block((i*60+2),50,60,25,"yellow.png"));
        }
           for(int i=0;i<33;i++){
            blocks.add(new Block((i*60+2),75,60,25,"green.png"));
        }
           ball.add(new Block(960, 927, 25, 25, "ball.png"));
           addKeyListener(this);
           setFocusable(true);
           // to read the keys
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Block b : blocks)
            b.draw(g,this);
        for(Block b : ball)
	b.draw(g, this);
        paddel.draw(g, this);
    }
    public void update(){
        repaint();
      
    }

    @Override
    public void keyTyped(KeyEvent e) {
      
    }

    @Override
    public void keyPressed(KeyEvent e) {
       if(e.getKeyCode() == KeyEvent.VK_ENTER){
			animate = new animate(this);
			thread = new Thread(animate);
			thread.start();
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT && paddel.x > 0){
			paddel.x-=100;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT && paddel.x < (getWidth()-paddel.width)){
			paddel.x+=100;
		}
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
    
}
