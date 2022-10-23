package imp;

/**
 * The type Activity management system.
 */
public class ActivityManagementSystem {
    private static ActivitySubSystem activitySubSystem = new ActivitySubSystem();
    private static UserSubSystem userSubSystem = new UserSubSystem();

    /**
     * Display user sub system.
     */
    public void displayUserSubSystem() {
        System.out.println(userSubSystem);

    }

    /**
     * Display activity sub system.
     */
    public void displayActivitySubSystem() {
        System.out.println(activitySubSystem);
    }

    /**
     * Gets user sub system.
     *
     * @return the user sub system
     */
    public UserSubSystem getUserSubSystem() {
        return userSubSystem;
    }

    /**
     * Gets activity sub system.
     *
     * @return the activity sub system
     */
    public ActivitySubSystem getActivitySubSystem() {
        return activitySubSystem;
    }
}
