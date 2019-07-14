
public class BasePlusCommissionEmployee {
	private double baseSalary;
	private CommissionEmployee employee;
	
	public BasePlusCommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSales,double commissionRate,double baseSalary)
	{
		employee = new CommissionEmployee(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);
		if(baseSalary<0)
		{
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		this.baseSalary = baseSalary;
	}
	
	public String getFirstName()
	{
		return employee.getFirstName();
	}
	public String getLastName()
	{
		return employee.getLastName();
	}
	public String getSocialSecurityNumber()
	{
		return employee.getSocialSecurityNumber();
	}
	public void setGrossSales(double grossSales)
	{
		if(grossSales<0.0)
		{
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		employee.setGrossSales(grossSales);
	}
	public double getGrossSales()
	{
		return employee.getGrossSales();
	}
	public void setCommissionRate(double commissionRate)
	{
		if(commissionRate<=0.0 || commissionRate>=1.0)
		{
			throw new IllegalArgumentException("Commission Rate must be > 0.0 and < 1.0");
		}
		employee.setCommissionRate(commissionRate);
	}
	public double getCommissionRate()
	{
		return employee.getCommissionRate();
	}
	public void setBaseSalary(double baseSalary)
	{
		if(baseSalary<0.0)
		{
			throw new IllegalArgumentException("Base salaary must be >= 0.0");
		}
		this.baseSalary = baseSalary;
	}
	public double getBaseSalary()
	{
		return baseSalary;
	}
	public double earnings()
	{
		return baseSalary + employee.earnings();
	}
	public String toString()
	{
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f","Base-Salary Commission Employee",employee.getFirstName(),employee.getLastName(),"Social Security Number",employee.getSocialSecurityNumber(),"Gross Sales",employee.getGrossSales(),"Commission Rate",employee.getCommissionRate(),"Base Salary",baseSalary);
	}
	

}
