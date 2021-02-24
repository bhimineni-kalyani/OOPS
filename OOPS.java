public class OOPSEmployeeWageComputation {
    public static final int ISPARTTIME = 1;
    public static final int ISFULLTIME = 2;

    public static int computeOOPSEWC(String COMPANY, int EMPLOYEERATEPERHOUR, int NUMBEROFWORKINGDAYS, int MAXIMUMHOURSINMONTH) {
        int EMPLOYEEHOURS = 0, TOTALEMPLOYEEHOURS = 0, TOTALWORKINGDAYS = 0;
        while (TOTALEMPLOYEEHOURS <= MAXIMUMHOURSINMONTH && TOTALWORKINGDAYS < NUMBEROFWORKINGDAYS) {
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
    int TOTALOOPSEWC = TOTALEMPLOYEEHOURS * EMPLOYEERATEPERHOUR ;
    System.out.println("TOTALEMPLOYEEHOURS : " +TOTALOOPSEWC);
    return TOTALOOPSEWC;
  }
  public static void main(String []args){
        computeOOPSEWC("AMAZON", 30 ,3 ,15);
        computeOOPSEWC("FLIPKART", 15 , 6 ,10);
  }
}
