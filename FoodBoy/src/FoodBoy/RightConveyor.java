package FoodBoy;

import java.awt.Image;

public class RightConveyor {
	
	private Queue<Food> rightConveyor;
	private Image[] images;
	private int stepper;
	
	public RightConveyor(Game game) {
		rightConveyor = new Queue<Food>();
		images = new Image[3];
		initImages(game);
		stepper = 0;
	}
	
	private void initImages(Game game) {
		images[0] = game.getImage(game.getBase(), "img/rightbelt1.png");
		images[1] = game.getImage(game.getBase(), "img/rightbelt2.png");
		images[2] = game.getImage(game.getBase(), "img/rightbelt3.png");
	}
	
	public Image getImage() {
		return images[stepper % images.length];
	}
	
	public void update() {
		stepper++;
	}

}

