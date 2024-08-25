package LiskovsSubstitutionPrinciple.Example3.WithoutLSP;

import java.util.ArrayList;
import java.util.List;

//problem statement :that inhouse product will get 1.5 times more discount
class Product{
	double discount=2;
	double getDiscount() {
		return discount;
	}
}
class InhouseProduct extends Product{
	double applyExtraDiscount()
	{
		return discount=discount*1.5;
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new InhouseProduct();
		List<Product> allproducts=new ArrayList<>();
		allproducts.add(p3);
		allproducts.add(p2);
		allproducts.add(p1);
		for(Product product:allproducts)
		{
			//now for inhouse product we have to make extra discount 
			//for that we need to check if the instacne is from inhouse 
			if(product instanceof InhouseProduct)
			{
				((InhouseProduct) product).applyExtraDiscount();//type casting
			}
			System.out.println(product.getDiscount());
		}
		
		
	}

}

//problem is in the code that we are asking to check if the instance is inhouse or not then call
//this is not good practise
// because we are not able to replace all the object of parent class with child class without affecting the correctness of the program
//we should deal with all kind of object as generic product object
