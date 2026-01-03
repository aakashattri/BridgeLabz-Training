
import java.util.ArrayList;

abstract class JobRole{
    private String name;
    private String resumeContent;
    JobRole(String jobRole,String resumeContent){
        this.name=jobRole;
        this.resumeContent=resumeContent;
    }
    public String getName() {
        return name;
    }
    public String getResumeContent() {
        return resumeContent;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName()+" -Candidate"+name;
    }
}
class SoftwareEngineer extends JobRole{

    SoftwareEngineer(String jobRole, String resumeContent) {
        super(jobRole, resumeContent);
        // TODO Auto-generated constructor stub
    }

}
class DataScientist extends JobRole{

    DataScientist(String jobRole, String resumeContent) {
        super(jobRole, resumeContent);
        // TODO Auto-generated constructor stub
    }

}
class ProductManager extends JobRole{

    ProductManager(String jobRole, String resumeContent) {
        super(jobRole, resumeContent);
        // TODO Auto-generated constructor stub
    }

}
class Resume<T extends JobRole> {
    private ArrayList<T> resumes=new ArrayList<>();
    public void addResume(T resume) {
        resumes.add(resume);
    }
    public ArrayList<T> getResumes() {
        return resumes;
    }
}
class ResumeScreeningUtil {
    public static void screenResumes(ArrayList<? extends JobRole> resumes) {
        System.out.println("Screening Resumes:");
        for (JobRole resume : resumes) {
            System.out.println(resume);
        }
    }
}
public class AIDrivenResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> softwareResumes = new Resume<>();
        softwareResumes.addResume(new SoftwareEngineer("Aditya", "Java, Spring Boot, Microservices"));
        softwareResumes.addResume(new SoftwareEngineer("Yash", "Python, Django, REST APIs"));

        Resume<DataScientist> dataResumes = new Resume<>();
        dataResumes.addResume(new DataScientist("Anirudh", "Machine Learning, TensorFlow, Data Analysis"));
        dataResumes.addResume(new DataScientist("Adarsh", "Deep Learning, NLP, Big Data"));

        System.out.println("Software Engineer Resumes:");
        ResumeScreeningUtil.screenResumes(softwareResumes.getResumes());

        System.out.println("\nData Scientist Resumes:");
        ResumeScreeningUtil.screenResumes(dataResumes.getResumes());
    }
}