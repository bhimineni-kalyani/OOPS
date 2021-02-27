public class CompanyEmpWage {
   public final String COMPANY;
    public final int EMPLOYEERATEPERHOUR;
    public final int NUMBEROFWORKINGDAYS;
    public final int MAXIMUMHOURSINMONTH;
    private int TOTALEMPLOYEEWAGE;
    public CompanyEmpWage(String COMPANY, int EMPLOYEERATEPERHOUR, 
                                       int NUMBEROFWORKINGDAYS, int MAXIMUMHOURSINMONTH) {
        this.COMPANY = COMPANY;
        this.EMPLOYEERATEPERHOUR = EMPLOYEERATEPERHOUR;
        this.NUMBEROFWORKINGDAYS = NUMBEROFWORKINGDAYS;
        this.NUMBEROFWORKINGDAYS = NUMBEROFWORKINGDAYS;
    }
    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }
    public String toString() {
        return "TOTAL Emp Wage FOR COMPANY : " +COMPANY+ " is : " +totalEmpWage;
    }
    public class EmpWageBuilderArray {
        public static final int ISPARTTIME = 1;
        public static final int ISFULLTIME = 2;
        private int NUMBEROFCOMPANY = 0;
        private CompanyEmpWage[] companyEmpWageArray;
        public EmpWageBuilderArray() {
            companyEmpWageArray = new CompanyEmpWage[5];
        }
        public void addCompanyEmpWage(String COMPANY, int EMPLOYEERATEPERHOUR, 
                                       int NUMBEROFWORKINGDAYS, int MAXIMUMHOURSINMONTH) {
            companyEmpWageArray[NUMBEROFCOMPANY] = new CompanyEmpWage(COMPANY, 
                         EMPLOYEERATEPERHOUR, NUMBEROFWORKINGDAYS, MAXIMUMHOURSINMONTH );
            NUMBEROFCOMPANY++;             
}
private void OOPSEmployeeWageComputation() {
    for (int i = 0; i < NUMBEROFCOMPANY; i++) {
        oopsemployeewagecomputationARRAY[i].setOOPSEWC(this.computeOOPSEWC(OOPSEmployeeWageComputationARRAY[i]));
        System.out.println(OOPSEmployeeWageComputationARRAY[i]);
    }
    private int computeEmpWage(CompanyEmpWage companyEmpWage) {
        int EMPLOYEEHOURS = 0, TOTALEMPLOYEEHOURS = 0, TOTALWORKINGDAYS = 0;
        while (TOTALEMPLOYEEHOURS <= MAXIMUMHOURSINMONTH && 
               TOTALWORKINGDAYS < NUMBEROFWORKINGDAYS) {
        TOTALWORKINGDAYS++ ;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
          switch (empCheck) {
            case ISPARTTIME :
                EMPLOYEEHOURS = 4;
                break;
            case ISFULLTIME :
                EMPLOYEEHOURS = 8;
                break;
            default :
                EMPLOYEEHOURS = 0;
        }
        TOTALEMPLOYEEHOURS += EMPLOYEEHOURS;
        System.out.println("Day# : " +TOTALWORKINGDAYS+ "EMPLOYEEHOURS : " +EMPLOYEEHOURS );
        }
        return TOTALEMPLOYEEHOURS * OOPSEmployeeWageComputation.EMPLOYEERATEPERHOUR;
    }
    public static void main(String[] args) {
    EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
    empWageBuilder.addCompanyEmpWage("AMAZON", 30 ,3 ,15);
    empWageBuilder.addCompanyEmpWage("FLIPKART", 15 , 6 ,10);
    empWageBuilder.computeEmpWage();
    }
}
}
