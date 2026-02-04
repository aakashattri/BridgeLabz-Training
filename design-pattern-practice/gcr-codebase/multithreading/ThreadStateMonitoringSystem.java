

import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class TaskRunner extends Thread{
    TaskRunner(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i=0;i<1_000_000;i++);
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        for(int i=0;i<1_000_000;i++);
    }
}
class StateMonitor extends Thread{
    private Thread[] tasks;
    private Map<String, Set<Thread.State>> summary=new HashMap<>();
    StateMonitor(Thread... tasks){
        this.tasks=tasks;
    }

    @Override
    public void run(){
        boolean allDone=false;
        while(!allDone){
            allDone=true;

            for(Thread t:tasks){
                Thread.State state=t.getState();
                String time=LocalTime.now().withNano(0).toString();
                System.out.println("[Monitor] "+t.getName()+" is in "+state+" state at "+time);
                summary.putIfAbsent(t.getName(),new HashSet<>());
                summary.get(t.getName()).add(state);
                if(state!=Thread.State.TERMINATED){
                    allDone=false;
                }
            }
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("\nSummary:");
        for(String name:summary.keySet()){
            System.out.println(name+" went through "+summary.get(name).size()+" states");
        }
    }
}
public class ThreadStateMonitoringSystem{
    public static void main(String[] args){
        TaskRunner t1=new TaskRunner("Task-1");
        TaskRunner t2=new TaskRunner("Task-2");
        StateMonitor monitor=new StateMonitor(t1,t2);
       
        monitor.start();
        t1.start();
        t2.start();
    }
}
