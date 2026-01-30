
class RobotSafetyException extends Exception{
    public RobotSafetyException(String message) {
        super(message);
    }
}
public class RobotHazardAuditor {
    public double CalculateHazardRisk(double armPrecision, int workerDensity, String machineryState) throws RobotSafetyException{
        double machineRiskFactor=0;
        double hazardRisk=0;
        if(!(armPrecision>=0.0 && armPrecision<=1.0)) {
            throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0 !");
        }
        else if(!(workerDensity>=1 && workerDensity<=20)) {
            throw new RobotSafetyException("Error:Worker density must be 1-20");
        }
        else if(!(machineryState.equals("Worn")||machineryState.equals("Faulty")||machineryState.equals("Critical"))) {
            throw new RobotSafetyException("Error: Unsupported machinery state");
        }
        else {
            switch(machineryState) {
                case "Worn":machineRiskFactor=1.3;
                    break;
                case "Faulty":machineRiskFactor=2.0;
                    break;
                case"Critical":machineRiskFactor=3.0;
                    break;
            }
            hazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);
        }
        return hazardRisk;
    }
}