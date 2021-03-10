import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
interface CompanyWage {
	public void addCompanyWage(String companyName, int empWagePerHr, int daysInMonth, int maxHrs);
	public void computeWage();
}

class CompanyEmpWage {

	public final String companyName;
	public final int empWagePerHr;
	public final int daysInMonth;
	public final int maxHrs;
	public int totalEmpWage;

	public CompanyEmpWage(String companyName, int empWagePerHr, int daysInMonth, int maxHrs) {

		this.companyName = companyName;
		this.empWagePerHr = empWagePerHr;
		this.daysInMonth = daysInMonth;
		this.maxHrs = maxHrs;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	public String toString(){
		return "Total Emp Wage for Company: " + companyName + " is: " + totalEmpWage;
	}
}

class EmpWage implements CompanyWage{

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	private int numOfCompany = 0;
	private ArrayList <CompanyEmpWage> companyEmpWageList;
	private Map<String,CompanyEmpWage> companyToEmpWageMap;
	
	public EmpWage() {
    	companyEmpWageList = new ArrayList<>();
	   companyToEmpWageMap  = new HashMap<>();	
	}

	public void addCompanyWage(String companyName, int empWagePerHr, int daysInMonth, int maxHrs){
	CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, empWagePerHr, daysInMonth, maxHrs);
	companyEmpWageList.add(companyEmpWage);
	companyToEmpWageMap.put(companyName, companyEmpWage);
	}

	public void computeWage() {
   	for (int i=0; i<companyEmpWageList.size(); i++){
	      CompanyEmpWage companyEmpWage = companyEmpWageList. get(i); 
	      companyEmpWage.setTotalEmpWage(this.computeWage(companyEmpWage));
		}
	}

	public int computeWage(CompanyEmpWage companyEmpWage){
	int totalWorkingDays = 0;
	int totalEmpHrs = 0;
	int empHrs = 0;
	int empWage = 0;

	 while ( totalWorkingDays < companyEmpWage.daysInMonth && totalEmpHrs <= companyEmpWage.maxHrs ) {
    	int empCheck =(int) Math.floor(Math.random() * 10) % 3;
	   if (empCheck == IS_FULL_TIME) {
	       empHrs = 8;
	   }
    	else if (empCheck == IS_PART_TIME) {
	           empHrs = 4;
	   }
      else {
	      empHrs = 0;
	   }
	   totalWorkingDays ++;
	   empWage = empHrs * companyEmpWage.empWagePerHr;
	   totalEmpHrs += empHrs;
	   System.out.println("Employee day: " + totalWorkingDays + " Emp Hr: " + empHrs + " Wage: "+empWage);
	 }
	 return totalEmpHrs * companyEmpWage.empWagePerHr;
	}
	
	public int getTotalWage(String companyName){
	   return companyToEmpWageMap.get(companyName).totalEmpWage;
   }	
	
	public static void main(String[] args){
	  EmpWage empwage = new EmpWage();
	  empwage.addCompanyWage("Amazon", 20, 10, 50);
	  empwage.addCompanyWage("Dmart", 25, 14, 40);
	  empwage.addCompanyWage("Flipkart", 20, 12, 40);
	  empwage.computeWage();
	  System.out.println("total wage for Amazon:" +empwage.getTotalWage("Amazon"));
	  System.out.println("total wage for Dmart:" +empwage.getTotalWage("Dmart"));
	  System.out.println("total wage for Flipkart:" +empwage.getTotalWage("Flipkart"));
	}
}
