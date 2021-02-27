import java.util.ArrayList;
import java.util.List;
class EmployeeWage implements CompanyWage
{
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private int numberofcompany = 0;
    private list<CompanyEmployeeWage> companyEmployeeWageList;
    public EmployeeWage() {
        companyEmployeeWageList = new ArrayList<>();
    }
    public void addCompanyWage(String company, int Employeerateperhour,
                                int Numberofworkingdays, int Maximumhourspermonth) {
        CompanyEmployeeWage companyEmployeeWage = new CompanyEmployeeWage(company, Employeerateperhour,
                                                        Numberofworkingdays, Maximumhourspermonth);
        companyEmployeeWageList.add(companyEmployeeWage);
        numberofcompany++;
    }
    public void computeEmployeeWage() {
        for(int i=0; i<companyEmployeeWageList.size(); i++) {
            CompanyEmployeeWage companyEmployeeWage = companyEmployeeWagelist.get(i);
            CompanyEmployeeWage.setTotalEmployeeWage(this.companyEmployeeWage(companyEmployeeWage));
            System.out.println(computeEmployeeWage);
            System.out.print(" ");
            System.out.println("_________");
        }
    }
    public int computeEmployeeWage(CompanyEmployeeWage companyEmployeeWage) {
        int EmployeeHours = 0;
        int TotalEmployeeWage = 0;
        int TotalEmployeeHours = 0;
        int TotalWorkingDays = 0;
        while(TotalEmployeeHours <= companyEmployeeWage.Maximumhourspermonth &&
               TotalWorkingDays < companyEmployeeWage.Numberofworkingdays)  {
                TotalWorkingDays++;
                int empCheck = (int) (Math.random() * 10) % 3;
                switch (empCheck) {
                    case IS_FULL_TIME :
                        System.out.println("Employee is present" +TotalWorkingDays);
                        EmployeeHours = 8;
                        break;
                    case IS_PART_TIME :
                        System.out.println("Employee is parttime" +TotalWorkingDays);
                        EmployeeHours = 4;
                        break;
                    default :
                        System.out.println("Employee is abscent" +TotalWorkingDays);
                        EmployeeHours = 0;
                }
                TotalEmployeeHours += EmployeeHours;
                System.out.println("Day : " +TotalWorkingDays+ "EmployeeHours : " +TotalEmployeeHours);
               }
                System.out.println("_________");    
                return TotalEmployeeHours * companyEmployeeWage.Employeerateperhour;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program with interface list");
    }
}
