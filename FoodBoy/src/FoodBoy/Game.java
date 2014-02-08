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
	
	@Override
	public void init() {
		
		setSize(800, 480);
		setBackground(Color.BLACK);
		setFocusable(true);
		Frame frame = (Frame)this.getParent().getParent();
		frame.setTitle("Food Boy");
		
		addKeyListener(this);
		
	}
	
	@Override
	public void start() {
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
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
			case KeyEvent.VK_LEFT:
			System.out.println("Left Hand!");
			break;
			
			case KeyEvent.VK_RIGHT:
			System.out.println("Right Hand!");
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT:
		System.out.println("Stop using left hand!");
		break;
		
		case KeyEvent.VK_RIGHT:
		System.out.println("Stop using right hand!");
		break;
	}
	    
	}

	@Override
	public void keyTyped(KeyEvent e) {
	    // TODO Auto-generated method stub
	    
	}

	
	
}
