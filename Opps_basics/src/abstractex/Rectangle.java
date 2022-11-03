package abstractex;

public class Rectangle  extends Shape{
	
	public Rectangle(int side1, int side2) {
		super(side1,side2);
	}
	
	
	@Override
	public int calArea()
	{return this.getSide1()*this.getSide2();}
	@Override
	public int calPerimeter() {
		return 2*(this.getSide1()+this.getSide2());
	}
}
