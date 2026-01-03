
import java.util.ArrayList;
import java.util.Date;

class CallLog{
    private String phoneNumber;
    private String message;
    private long timestamp;
    CallLog(String phoneNumber,String message){
        this.phoneNumber=phoneNumber;
        this.message=message;
        this.timestamp=new Date().getTime();
    }
    public String getNumber() {
        return phoneNumber;
    }
    public String getMessage() {
        return message;
    }
    public long getTime() {
        return timestamp;
    }
    @Override
    public String toString() {
        return "CallLog [Number=" + phoneNumber +
                ", Message=" + message +
                ", Time=" + new Date(timestamp) + "]";
    }
}

public class CustomerServiceCallLogManager {
    private static ArrayList<CallLog>callLogs=new ArrayList<>();
    public void addCallLog(CallLog calllog) {
        callLogs.add(calllog);
    }
    public ArrayList<CallLog> filterByTime(long time) {
        ArrayList<CallLog>result=new ArrayList<>();
        for (CallLog log:callLogs) {
            if (log.getTime()>=time) {
                result.add(log);
            }
        }
        return result;
    }

    public ArrayList<CallLog> searchByKeyword(String keyword) {
        ArrayList<CallLog> result=new ArrayList<>();
        for (CallLog log:callLogs) {
            if (log.getMessage().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(log);
            }
        }
        return result;
    }

    public static void main(String[] args) throws InterruptedException {
        CustomerServiceCallLogManager manager=new CustomerServiceCallLogManager();
        manager.addCallLog(new CallLog("9856487595", "Hi call me back"));
        Thread.sleep(10);
        manager.addCallLog(new CallLog("9123456789", "Issue with payment"));
        manager.addCallLog(new CallLog("9000000000", "Call disconnected"));
        System.out.println("Search by keyword 'call':");
        for (CallLog log : manager.searchByKeyword("call")) {
            System.out.println(log);
        }
    }
}