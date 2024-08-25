package LiskovsSubstitutionPrinciple.Exmaple1.WithLSP;

public class Car extends Vehicle{
	public void getInteriorWidth()
	{
		this.getCabinWidth();
	}
	public void getCabinWidth() 
	{
		System.out.println("4");
	}

}
