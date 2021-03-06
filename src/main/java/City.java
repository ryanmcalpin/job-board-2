import java.util.List;
import java.util.ArrayList;

public class City {
  private String mName;
  private static List<City> instances = new ArrayList<City>();
  private int mId;
  private List<JobOpening> mJobs;

  public City(String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();
    mJobs = new ArrayList<JobOpening>();
  }

  public String getName() {
    return mName;
  }

  public static List<City> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static City find(int id) {
    return instances.get(id - 1);
  }

  public List<JobOpening> getJobs() {
    return mJobs;
  }

  public void addJob(JobOpening job) {
    mJobs.add(job);
  }

}
