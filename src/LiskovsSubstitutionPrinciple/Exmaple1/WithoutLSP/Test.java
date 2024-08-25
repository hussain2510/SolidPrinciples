package LiskovsSubstitutionPrinciple.Exmaple1.WithoutLSP;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Racing_CAR();
		List<Car> allcars=new ArrayList<>();
		allcars.add(c1);
		allcars.add(c2);
		allcars.add(c3);
		for(Car car:allcars)
		{
			
			//car.getCabinWidth();failed for 3rd car object c3
		}
	}

}
//we can see it will fail beause for the 3rd object it will give error becasue racing car throwing exception so here we are not able to replace all car object with its sybtype if we replace the correctness of the program is failed