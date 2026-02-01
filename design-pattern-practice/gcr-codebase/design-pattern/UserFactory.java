package design_pattern_practice.gcr_codebase.design_patterns;

public class UserFactory {
	public static User createUser(String type) {
        if (type.equalsIgnoreCase("student"))
            return new Student();
        else if (type.equalsIgnoreCase("faculty"))
            return new Faculty();
        else if (type.equalsIgnoreCase("librarian"))
            return new Librarian();
        return null;
    }
}
