package LiskovsSubstitutionPrinciple.Exmaple2.WithLSP;

abstract class Shape{
	abstract int getArea();
}
class Square extends Shape{
	int height;
	int width;
	Square(int height,int width)
	{
		this.height=height;
		this.width=width;
	}
	int getArea() {
		return width*height;
	}
}
class Rectangle extends Shape{
	int width;
	int height;
	Rectangle(int height,int width)
	{
		this.height=height;
		this.width=width;
	}
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
		Shape s1=new Rectangle(2,3);
		Shape s2=new Rectangle(3,2);
		Shape s3=new Square(3,3);
		//now the functionality of the shape would break becuase it has h to return area 
	}

}
