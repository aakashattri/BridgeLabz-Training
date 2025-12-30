
class TextState{
    String content;
    TextState prev,next;
    public TextState(String content){
        this.content=content;
        this.prev=this.next=null;
    }
}
class TextEditor{
    private TextState current;
    private int historyLimit;
    private int historySize;
    public TextEditor(int limit){
        this.historyLimit=limit;
        this.historySize=0;
        this.current=null;
    }
    public void addState(String content){
        TextState newState=new TextState(content);
        if(current!=null){
            current.next=newState;
            newState.prev=current;
        }
        current=newState;
        historySize++;
        trimHistory();
    }
    public void undo(){
        if(current!=null && current.prev!=null){
            current=current.prev;
        }else{
            System.out.println("No more undo steps available.");
        }
    }

    public void redo(){
        if(current!=null && current.next!=null){
            current=current.next;
        }else{
            System.out.println("No more redo steps available.");
        }
    }
    public void displayCurrentState(){
        if(current!=null){
            System.out.println("Current Text: "+current.content);
        }else{
            System.out.println("No text available.");
        }
    }
    private void trimHistory(){
        if(historySize>historyLimit){
            TextState temp=current;
            while(temp.prev!=null){
                temp=temp.prev;
            }
            temp.next.prev=null;
            temp.next=null;
            historySize--;
        }
    }
}
public class UndoRedoOptDoubly{
    public static void main(String[] args){
        TextEditor editor=new TextEditor(10);
        editor.addState("Hello");
        editor.addState("Hello, my");
        editor.addState("Hello, my name is");
        editor.addState("Hello, my name is anurag");
        editor.displayCurrentState();
        System.out.println("Undoing...");
        editor.undo();
        editor.displayCurrentState();
        System.out.println("Redoing...");
        editor.redo();
        editor.displayCurrentState();
    }
}
