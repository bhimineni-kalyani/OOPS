public class OOPSEmployeeWageComputation {
    public static final int ISPARTTIME = 1;
    public static final int ISFULLTIME = 2;
    public final String COMPANY;
    public final String EMPLOYEERATEPERHOUR;
    public final String NUMBEROFWORKINGDAYS;
    public final String MAXIMUMHOURSINMONTH;
    private int TOTALEMPLOYEEWAGE;
    public OOPSEmployeeWageComputation(String COMPANY, int EMPLOYEERATEPERHOUR, 
                                       int NUMBEROFWORKINGDAYS, int MAXIMUMHOURSINMONTH) {
        this.COMPANY = COMPANY;
        this.EMPLOYEERATEPERHOUR = EMPLOYEERATEPERHOUR;
        this.NUMBEROFWORKINGDAYS = NUMBEROFWORKINGDAYS;
        this.NUMBEROFWORKINGDAYS = NUMBEROFWORKINGDAYS;
    }
    public void computeOOPSEWC() {
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
        TOTALOOPSEWC = TOTALEMPLOYEEHOURS * EMPLOYEERATEPERHOUR ;
    }
    public String toString() {
        return "TOTAL EMPLOYEE WAGE FOR COMPANY : " +COMPANY+ " is : " +TOTALOOPSEWC;
}
public static void main(String []args){
        OOPSEmployeeWageComputation AMAZON = new OOPSEmployeeWageComputation("AMAZON", 30 ,3 ,15);
        OOPSEmployeeWageComputation FILPKART = new OOPSEmployeeWageComputation("FLIPKART", 15 , 6 ,10);
        AMAZON.computeOOPSEWC();
        System.out.println(AMAZON);
        FLIPKART.computeOOPSEWC();
        System.out.println(FLIPKART);
}
