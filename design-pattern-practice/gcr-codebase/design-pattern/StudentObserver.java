package design_pattern_practice.gcr_codebase.design_patterns;

public class StudentObserver implements Observer {
    private String name;
    public StudentObserver(String name) {
        this.name=name;
    }
    @Override
    public void update(String bookName) {
        System.out.println("Notification to Student "+name+": "+bookName+" added!");
    }
}
