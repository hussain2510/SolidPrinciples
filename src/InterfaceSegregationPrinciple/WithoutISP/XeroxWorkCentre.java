package InterfaceSegregationPrinciple.WithoutISP;
//it has all the feature of printing,scanning,fax
public class XeroxWorkCentre implements IMultifunction{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		//code
		
	}

	@Override
	public void getPrintpoonDetails() {
		// TODO Auto-generated method stub
		//code
		
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		//code
		
	}

	@Override
	public void scanPhoto() {
		// TODO Auto-generated method stub
		//code
		
	}

	@Override
	public void fax() {
		// TODO Auto-generated method stub
		//code
		
	}

	@Override
	public void internetFax() {
		// TODO Auto-generated method stub
		//code
		
	}
	

}
//low cohesion between methods 
