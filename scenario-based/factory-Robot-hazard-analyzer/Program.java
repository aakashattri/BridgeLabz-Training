
public class Program {
    public static void main(String[] args) {
        RobotHazardAuditor robotHazardAuditor=new RobotHazardAuditor();
        test(robotHazardAuditor,0.5,10,"Critical");
        test(robotHazardAuditor,1.3,4,"Worn");
        test(robotHazardAuditor,0.7,26,"Critical");
        test(robotHazardAuditor,0.3,14,"Optimal");
    }
    static void test(RobotHazardAuditor auditor,double precision,int density,String state) {
        try {
            System.out.println("Robot Hazard Risk Score:"+auditor.CalculateHazardRisk(precision, density, state));
        } catch (RobotSafetyException e) {
            System.out.println(e.getMessage());
        }
    }
}