
import java.util.Random;

public class EmployeeWage {
    Random random=new Random();
    static final int WAGE_PER_HOUR=20;
    static final int FULL_DAY_HOUR=8;
    static final int PART_TIME_HOUR=8;
    static final int WORKING_DAY_PER_MONTH=20;
    static final int MAX_WORKING_HOUR=100;
    static final int MAX_WORKING_DAY=20;

    static final int IS_PRESENT=1;
    static final int IS_PARTTIME=1;
    static final int IS_FULLTIME=2;

    public int calculateDailyWage() {
        int employeeType=random.nextInt(3);
        int workingHours=0;

        switch(employeeType) {
            case IS_FULLTIME:
                workingHours=FULL_DAY_HOUR;
                break;
            case IS_PARTTIME:
                workingHours=PART_TIME_HOUR;
                break;
            default:
                workingHours=0;
        }
        return workingHours*WAGE_PER_HOUR;
    }

    public int monthlyWage() {
        int totalWorkingDays=0;
        int totalWorkingHours=0;
        int totalWage=0;

        while(totalWorkingDays<=MAX_WORKING_DAY && totalWorkingHours<=MAX_WORKING_HOUR) {
            totalWorkingDays++;
            int empType=random.nextInt(3);
            int dailyHours=0;

            switch(empType) {
                case IS_FULLTIME:
                    dailyHours=FULL_DAY_HOUR;
                    break;
                case IS_PARTTIME:
                    dailyHours=PART_TIME_HOUR;
                    break;
                default:
                    dailyHours=0;
            }

            totalWorkingHours+=dailyHours;
            totalWage+=dailyHours*WAGE_PER_HOUR;
        }
        return totalWage;
    }

    public int isAbsent() {
        return random.nextInt(2);
    }

    public static void main(String[] args) {
        EmployeeWage ew=new EmployeeWage();

        System.out.println("-----Welcome to Employee Wage Computation Program on Master Branch-----");

        if(ew.isAbsent()==1) {
            System.out.println("Present");
        } else {
            System.out.println("Absent");
        }

        System.out.println("Daily Wage: "+ew.calculateDailyWage());
        System.out.println("Monthly: "+ew.monthlyWage());
    }
}