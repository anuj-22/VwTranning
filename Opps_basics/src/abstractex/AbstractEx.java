package abstractex;

public class AbstractEx {
	public static void main(String[]args) {
		Shape s ;
		
		s= new Square(4);
		System.out.println(s.calArea());
		System.out.println(s.calPerimeter()); 
		s =new Rectangle(3,4);
		/*System.out.println(s.calArea());
		System.out.println(s.calPerimeter()); */
		meth(s);
	
	
	
	}
	
	public static void meth(Shape s) {
		System.out.println(s.calArea());
		System.out.println(s.calPerimeter());
	}
}

