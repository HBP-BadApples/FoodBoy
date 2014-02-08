package FoodBoy;

public class FatMan {
	
	final int SPEED = 5;
	
	private boolean left = false;
	private boolean right = false;
	
	private int posLX=0;
	private int posLY=0;
	private int posRX=0;
	private int posRY=0;
	
	public void update(){
		if(left==true){
			
		}
	}
	
	public void leftHand(){
		posLX = SPEED;
		posLY = SPEED;
		setLeft(true);
	}
	
	public void rightHand(){  
		posRX = SPEED;
		posRY = SPEED;
		setRight(true);
	}
	
	public void stopLeft(){
		setLeft(false);
		stop();
	}
	
	public void stopRight(){
		setRight(false);
		stop();
	}
	
	private void stop(){
		if(isLeft() == false && isRight() == false){
			posLX=0;
			posLY=0;
			posRX=0;
			posRY=0;
		}
		
		if(isLeft() == true && isRight() == false){
			leftHand();
		}
		
		if(isLeft() == false && isRight() == true){
			rightHand();
		}
	}
	
	public boolean isLeft(){
		return left;
	}
	
	public boolean isRight(){
		return right;
	}
	
	public void setLeft(boolean left){
		this.left = left;
	}
	
	public void setRight(boolean right){
		this.right = right;
	}
	
	
	
}
