package LiskovsSubstitutionPrinciple.Exmaple2.WithoutLSP;
abstract class Shape{
	abstract int getArea();
}
class Square extends Rectangle{
	
}
class Rectangle extends Shape{
	int width;
	int height;
	void setHeight()
	{
		this.height=height;
	}
	void setWidth()
	{
		this.width=width;
	}
	int getArea()
	{
		return width*height;
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		Rectangle r3=new Square();
		//now if we call getArea and before that set height and width for each of the object
		//like for 3rd one r3.setHeight(3),r3.setWidth(5) so area will return 15 but it should return 5*5 because for square width=height=width
		//so for this we need to take care by checking if the instance is square then only pass width else pass both that is not good because this complexity is to handled by client and good practise is client should not worry about implementation 
		//he can come and directly call Area
		
		
		
		//issue occurr also when
		//Rectangle r=factory.createRandomShape(); will give random random shape object either rectangle or square
		//and if we call setHeight(5),setWidth(10) but for square it width=height=width 
		//so it altering the expected behaviour
	}

}

//reason this is happpend because square are rectangle but not all the rectangle are squares






//better example
//Violation of Likov's Substitution Principle
//class Rectangle
//{
//	protected int m_width;
//	protected int m_height;
//
//	public void setWidth(int width){
//		m_width = width;
//	}
//
//	public void setHeight(int height){
//		m_height = height;
//	}
//
//
//	public int getWidth(){
//		return m_width;
//	}
//
//	public int getHeight(){
//		return m_height;
//	}
//
//	public int getArea(){
//		return m_width * m_height;
//	}	
//}
//
//class Square extends Rectangle 
//{
//	public void setWidth(int width){
//		m_width = width;
//		m_height = width;
//	}
//
//	public void setHeight(int height){
//		m_width = height;
//		m_height = height;
//	}
//
//}
//
//class LspTest
//{
//	private static Rectangle getNewRectangle()
//	{
//		// it can be an object returned by some factory ... 
//		return new Square();
//	}
//
//	public static void main (String args[])
//	{
//		Rectangle r = LspTest.getNewRectangle();
//     
//		r.setWidth(5);
//		r.setHeight(10);
//		// user knows that r it's a rectangle. 
//		// It assumes that he's able to set the width and height as for the base class
//
//		System.out.println(r.getArea());
//		// now he's surprised to see that the area is 100 instead of 50.
//	}
//}

