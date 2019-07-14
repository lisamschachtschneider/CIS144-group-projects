/*
 * Lisa Marie Schachtschneider
 * Raymundo Quinones
 * James Kwok
 * 
 * CIS 144 Summer
 * Group Project 6
 */

public class BasePlusCommissionEmployee {
   private double baseSalary; // base salary per week
   private CommissionEmployee commissionEmployee;

   // six-argument constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate, double baseSalary) {
      
      // remove super reference because we're not inheriting, instead we're reference the object
      this.commissionEmployee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);                     
      
      // if baseSalary is invalid throw exception
      if (baseSalary < 0.0) {                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
      }       

      this.baseSalary = baseSalary;
   }
   
   // set base salary
   public void setBaseSalary(double baseSalary) {
      if (baseSalary < 0.0) {                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
      }       

      this.baseSalary = baseSalary;                
   } 

   public String getFirstName() {
       return commissionEmployee.getFirstName();
   }
   
   public String getLastName() {
       return commissionEmployee.getLastName();
   }   
   
   public String getSocialSecurityNumber() {
       return commissionEmployee.getSocialSecurityNumber();
   }
   
   public double getGrossSales() {
       return commissionEmployee.getGrossSales();
   }
  
   public double getCommissionRate() {
       return commissionEmployee.getCommissionRate();
   }
   
   // return base salary
   public double getBaseSalary() {
       return baseSalary;
   }

   public double earnings() {
       return getBaseSalary() + commissionEmployee.earnings();
   }

   public String toString() {
      return String.format("%s %s%n%s: %.2f", "base-salaried",
              commissionEmployee.toString(), "base salary", getBaseSalary());   
   } 
} 
