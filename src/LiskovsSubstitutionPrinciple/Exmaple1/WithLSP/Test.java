package LiskovsSubstitutionPrinciple.Exmaple1.WithLSP;

import LiskovsSubstitutionPrinciple.Exmaple1.WithLSP.Car;
import LiskovsSubstitutionPrinciple.Exmaple1.WithLSP.Vehicle;
import LiskovsSubstitutionPrinciple.Exmaple1.WithLSP.Racing_CAR;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Vehicle c1=new Car();
		Vehicle c2=new Car();
		Vehicle c3=new Racing_CAR();
		List<Vehicle> allcars=new ArrayList<>();
		allcars.add(c1);
		allcars.add(c2);
		allcars.add(c3);
		for(Vehicle vehicle:allcars)
		{
			
			vehicle.getInteriorWidth();
		}
	}

}
//here client dont have to know about the implementation details so if the Vehicle class object is replaced with need to make another design that will voilate the LSP