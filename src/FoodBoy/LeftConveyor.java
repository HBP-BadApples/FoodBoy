package FoodBoy;

import java.applet.Applet;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class LeftConveyor{

	private Queue<Food> leftConveyor;
	private Image[] images;
	private int stepper;


	public LeftConveyor(Game game) {
		leftConveyor = new Queue<Food>();
		images = new Image[3];
		initImages(game);
	}

	private void initImages(Game game) {
		images[0] = game.getImage(game.getBase(), "img/leftbelt1.png");
		images[1] = game.getImage(game.getBase(), "img/leftbelt2.png");
		images[2] = game.getImage(game.getBase(), "img/leftbelt3.png");
	}

	public Image getImage() {
		return images[stepper % images.length];
	}

	public void update() {
		stepper++;
	}


}
