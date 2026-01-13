
public class TimeOutCheck {
    public boolean timeRunningCheckout(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return true;
    }
}