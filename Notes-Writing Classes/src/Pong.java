import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pong extends JPanel implements KeyListener, ActionListener {

    Timer t;

           
    /* paint is getting called roughly 60x per second */
    public void paint(Graphics g) {
        super.paintComponent(g);
       
    }
   
   
    public void keyPressed(KeyEvent arg0) {
        System.out.println(arg0.getKeyCode());
        
    }


    public void keyReleased(KeyEvent arg0) {
        System.out.println(arg0.getKeyCode());
       
      
    }


    public void keyTyped(KeyEvent arg0) {
       
       
    }
    
    
    
    //Frame Setup code below ---------------------------------
    public static void main(String[] arg) {
    	Pong p = new Pong();
    }
    
    public Pong() {
    	//Name of title bar of the GUI
    			JFrame f = new JFrame("Pong");
    			
    			//makes sure that the program stops when the window is close
    			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //don't delete
    			
    			//GUI dimensions - width - height
    			f.setSize(800,600);
    			
    			
    			f.add(this);
    			f.addKeyListener(this);
    			
    			t = new Timer();
    			f.setVisible(true);
    }

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}
   
}