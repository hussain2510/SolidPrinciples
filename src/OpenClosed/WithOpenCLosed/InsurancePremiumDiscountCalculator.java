package OpenClosed.WithOpenCLosed;

public class InsurancePremiumDiscountCalculator {
	public int calculatePremiumDiscountPercent(CustomerProfile customer)
	{
		if(customer.isLoyal())
		{
			return 20;
		}
		return 0;
	}
}

//problem is InsurancePremiumDiscountCalculator is tightly coupled with HealthInsuranceCustomer Profile and in that case we can use any other like VehicleInsuranceCustomer profile so we can say it is close for extension
