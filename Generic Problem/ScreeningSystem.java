abstract class JobRole {}

class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}
class ProductManager extends JobRole {}

class Resume<T extends JobRole> {
    private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public T getJobRole() {
        return jobRole;
    }

    @Override
    public String toString() {
        return "Resume{name='" + candidateName + "', role=" + jobRole.getClass().getSimpleName() + "}";
    }
}

class ScreeningSystem {
    public static void processResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Processing role: " + role.getClass().getSimpleName());
        }
    }

    public static <T extends JobRole> void processResume(Resume<T> resume) {
        System.out.println("Processing resume: " + resume);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>("Alice", new SoftwareEngineer());
        Resume<DataScientist> dsResume = new Resume<>("Bob", new DataScientist());
        Resume<ProductManager> pmResume = new Resume<>("Charlie", new ProductManager());

        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        ScreeningSystem.processResume(seResume);
        ScreeningSystem.processResume(dsResume);
        ScreeningSystem.processResume(pmResume);

        ScreeningSystem.processResumes(roles);
    }
}
