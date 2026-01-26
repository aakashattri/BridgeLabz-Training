package java8.lambda_functions;

@FunctionalInterface
interface LightAction {
    void activate();
}

public class SmartLight {
    public static void main(String[] args) {
        LightAction motionTrigger=()->System.out.println("Lights ON with medium brightness");
        LightAction nightTimeTrigger=() ->System.out.println("Lights ON with warm dim light");
        LightAction voiceCommandTrigger=() ->System.out.println("Lights ON with full brightness");
        motionTrigger.activate();
        nightTimeTrigger.activate();
        voiceCommandTrigger.activate();
    }
}

