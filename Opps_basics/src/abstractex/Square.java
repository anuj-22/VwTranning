package abstractex;

public class Square extends Shape {
	public Square(int side) {
		super(side);
	}
	@Override
	public int calArea()
	{return this.getSide1()*this.getSide2();}
	@Override
	public int calPerimeter() {
		return this.getSide1()*4;
	}
			
			
}
