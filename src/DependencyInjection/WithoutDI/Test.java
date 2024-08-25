package DependencyInjection.WithoutDI;
import java.util.*;
import java.util.Arrays;

class SQLProductRepository{
	public List<String> getAllProductName(){
		return Arrays.asList("soap","toothpaste");
	}
}
class PorductCatalog{
	public void listAllProducts()
	{
		SQLProductRepository sqlproductrepository=new SQLProductRepository();
		List<String> allProductNames=sqlproductrepository.getAllProductName();
		//display product names;
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//problem:here High level module directly depends on the low level module so its voilating the dependency inversion principle