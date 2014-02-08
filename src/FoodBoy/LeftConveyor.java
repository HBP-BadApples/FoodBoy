package FoodBoy;

import java.applet.Applet;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class LeftConveyor {
	
	private Queue<Food> leftConveyor;
	private Image[] images;
	private URL base;
	private int stepper;
	
	
	public LeftConveyor() {
		leftConveyor = new Queue<Food>();
		images = new Image[3];
		try {
			base = getDocumentBase();
		} catch(Exception e) {
			e.printStackTrace();
		}
		getImagesIconsFromFile();
	}
	
	private void getImagesIconsFromFile() {
		for(int i = 0; i < images.length; i++) {
			images[i] = getImage(base, "img/leftbelt" + (i + 1) + ".png");
		}
	}
	
	public Image getImage() {
		return images[stepper % images.length];
	}
	
	public void update() {
		stepper++;
	}
	

}
