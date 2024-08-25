package LiskovsSubstitutionPrinciple.Example3.WithLSP;

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
	double getDiscount()
	{
		return this.applyExtraDiscount();
	}
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
			
			System.out.println(product.getDiscount());
		}
		
		
	}

}

//solution

