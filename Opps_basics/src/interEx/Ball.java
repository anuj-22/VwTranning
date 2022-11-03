package interEx;

public class Ball implements Bounceable {
	private int bf; 
	private String color;
	
	
	public Ball(String ballcolor) {
		super();
		this.color=ballcolor;
	}
	@Override 
	public void bounce() 
	{
		System.out.println("It's a"+this.color +" Color ball Bouncing with a bounce factor"+this.bf);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public void setBounceMultiple(int multiple) {
		this.bf= Bounceable.BOUNCE_FACTOR*multiple;
	}
}
