class Task{
    int taskId,priority;
    String taskName,dueDate;
    Task next;
    public Task(int taskId,String taskName,int priority,String dueDate){
        this.taskId=taskId;
        this.taskName=taskName;
        this.priority=priority;
        this.dueDate=dueDate;
        this.next=this;
    }
}
class TaskScheduler{
    private Task head,current;
    public void addAtBeginning(int id,String name,int priority,String date){
        Task newTask=new Task(id,name,priority,date);
        if(head==null){
            head=newTask;
            newTask.next=head;
        }else{
            Task temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            newTask.next=head;
            temp.next=newTask;
            head=newTask;
        }
        if(current==null)current=head;
    }
    public void addAtEnd(int id,String name,int priority,String date){
        Task newTask=new Task(id,name,priority,date);
        if(head==null){
            head=newTask;
            newTask.next=head;
        }else{
            Task temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newTask;
            newTask.next=head;
        }
        if(current==null)current=head;
    }
    public void removeById(int id){
        if(head==null)return;
        Task temp=head,prev=null;
        do{
            if(temp.taskId==id){
                if(prev!=null){
                    prev.next=temp.next;
                }else{
                    Task last=head;
                    while(last.next!=head){
                        last=last.next;
                    }
                    head=head.next;
                    last.next=head;
                }
                if(current==temp)current=temp.next;
                return;
            }
            prev=temp;
            temp=temp.next;
        }while(temp!=head);
    }
    public Task viewCurrent(){
        return current;
    }
    public void moveNext(){
        if(current!=null)current=current.next;
    }
    public void displayAll(){
        if(head==null)return;
        Task temp=head;
        do{
            System.out.println(
                    temp.taskId+" "+temp.taskName+" "+temp.priority+" "+temp.dueDate
            );
            temp=temp.next;
        }while(temp!=head);
    }
    public Task searchByPriority(int priority){
        if(head==null)return null;
        Task temp=head;
        do{
            if(temp.priority==priority){
                return temp;
            }
            temp=temp.next;
        }while(temp!=head);

        return null;
    }
}
public class TaskSchedulerSystemCircular{
    public static void main(String[] args){
        TaskScheduler scheduler=new TaskScheduler();
        scheduler.addAtBeginning(1,"Design",1,"10-01-2025");
        scheduler.addAtEnd(2,"Coding",2,"15-01-2025");
        scheduler.addAtEnd(3,"Testing",3,"20-01-2025");
        scheduler.displayAll();
        scheduler.moveNext();
        Task t=scheduler.viewCurrent();
        System.out.println(t.taskId+" "+t.taskName);
        scheduler.removeById(2);
        scheduler.displayAll();
    }
}
