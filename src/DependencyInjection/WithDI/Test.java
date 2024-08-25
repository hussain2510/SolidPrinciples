package DependencyInjection.WithDI;
import java.util.*;
import java.util.Arrays;

//class SQLProductRepository implements ProductRepository{
//	public List<String> getAllProductName(){
//		return Arrays.asList("soap","toothpaste");
//	}
//}
//class PorductCatalog{
//	public void listAllProducts()
//	{
//		ProductRepository productrepository=ProductFactory.create();
//		List<String> allProductNames=productrepository.getAllProductName();
//		//display product names;
//	}
//}
//class ProductFactory{
//	public static ProductRepository create()
//	{
//		return new SQLProductRepository();
//	}
//}
//public class Test {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//
//	}
//
//}
//now the high level module productcatalog depends on the abstraction which is productrepository and the details which is sqlproductrepository here is depends on abstraction productrepository
//productcatalog(depends on)->productrepository<-(depends on) sqlproductrepository

//but here is also a problem where the productcatalog class  need to take care of the instanciation of its  dependency that is when to callfactory method because productcatalog depends on productrepository so productrepository is a dependency and we are creating dependency via factory class but that is to be done by productcatlog class which is not good design
//we should better do this via constructor injectection


//solution2
class SQLProductRepository implements ProductRepository{
	public List<String> getAllProductName(){
		return Arrays.asList("soap","toothpaste");
	}
}
class ProductCatalog{
	ProductRepository productrepository;
	ProductCatalog(ProductRepository productrepository)
	{
		this.productrepository=productrepository;
	}
	public void listAllProducts()
	{
		
		List<String> allProductNames=productrepository.getAllProductName();
		//display product names;
		for(String s:allProductNames)
		{
			System.out.println(s);
		}
	}
}
class ProductFactory{
	public static ProductRepository create()
	{
		return new SQLProductRepository();
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductRepository productrepository=ProductFactory.create();
		//injecting the dependency of the productcatalog via main method
		ProductCatalog productcatalog=new ProductCatalog(productrepository);
		productcatalog.listAllProducts();
		

	}

}
//we can also improve this via injecting the dependdency not via main method or main flow of program it can do with the help of framework like spring where we have spring container that is IOC container which take care of alll this instacntiation and injecting the dependency where it is required and the plus point is here is all this thing is done in separate context that is springcontext

