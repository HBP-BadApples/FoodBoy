package FoodBoy;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Image;
import java.awt.Graphics;
import java.net.URL;

public class Game extends Applet implements Runnable, KeyListener{

	private FatMan man;
	private Image image, character, background;
	private Graphics second;
	private URL base;
	private static Background bg;
	
	@Override
	public void init() {
		
		setSize(800, 480);
		setBackground(Color.BLACK);
		setFocusable(true);
		Frame frame = (Frame)this.getParent().getParent();
		frame.setTitle("Food Boy");
		addKeyListener(this);
		try{
			base = getDocumentBase();
		} catch(Exception e){
			
		}
		
		character = getImage(base, "data/character.png");
		background = getImage(base, "data/background.png");
		
	}
	
	@Override
	public void start() {
		bg = new Background(0,0);
		
		Thread thread=new Thread(this);
		thread.start();
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void run() {
		while(true){
			repaint();
			try{
				Thread.sleep(17);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	@Override
    public void update(Graphics g) {
        if (image == null) {
            image = createImage(this.getWidth(), this.getHeight());
            second = image.getGraphics();
        }

        second.setColor(getBackground());
        second.fillRect(0, 0, getWidth(), getHeight());
        second.setColor(getForeground());
        paint(second);

        g.drawImage(image, 0, 0, this);

    }
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
			case KeyEvent.VK_LEFT:
			man.leftHand();
			System.out.println("Left Hand!");
			break;
			
			case KeyEvent.VK_RIGHT:
			man.rightHand();
			System.out.println("Right Hand!");
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT:
		man.stopLeft();
		System.out.println("Stop using left hand!");
		break;
		
		case KeyEvent.VK_RIGHT:
		man.stopRight();
		System.out.println("Stop using right hand!");
		break;
	}
	    
	}

	@Override
	public void keyTyped(KeyEvent e) {
	    // TODO Auto-generated method stub
	    
	}
 
	public static Background getBg(){
		return bg;
	}
	
	
}
