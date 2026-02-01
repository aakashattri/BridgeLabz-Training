package design_pattern_practice.gcr_codebase.design_patterns;

public class FacultyObserver implements Observer {
    private String name;
    public FacultyObserver(String name) {
        this.name=name;
    }
    @Override
    public void update(String bookName) {
        System.out.println("Notification to Faculty "+name+": "+bookName+" added!");
    }
}
