package imp;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * The type Activity sub system.
 */
public class ActivitySubSystem {
    private ArrayList<Activity> activities = new ArrayList<Activity>();

    /**
     * Add activity.
     *
     * @param activity the activity
     */
    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    /**
     * Remove activity by id.
     *
     * @param id the id
     */
    public void removeActivityById(String id) {
        for (Activity activity : activities) {
            if (activity.getId().equals(id)) {
                activities.remove(activity);
                break;
            }
        }
    }

    /**
     * Gets activity by id.
     *
     * @param id the id
     * @return the activity by id
     */
    public Activity getActivityById(String id) {
        for (Activity activity : activities) {
            if (activity.getId().equals(id)) {
                return activity;
            }
        }
        return null;
    }

    /**
     * Gets activities by date.
     *
     * @param date the date
     * @return the activities by date
     */
    public ArrayList<Activity> getActivitiesByDate(Date date) {
        ArrayList<Activity> result = new ArrayList<Activity>();
        for (Activity activity : activities) {
            if (activity.getStartTime().before(date) && activity.getEndTime().after(date)) {
                boolean sameFlag = false;
                for (Activity otherActivity : result) {
                    if (otherActivity.getId().equals(activity.getId())) {
                        sameFlag = true;
                    }
                }
                if (sameFlag == false) {
                    result.add(activity);
                }

            }
        }
        return result;
    }

    /**
     * Gets activity list.
     *
     * @return the activity list
     */
    public List<Activity> getActivityList() {
        return (List<Activity>) activities;
    }

    /**
     * Check activity num of team int.
     *
     * @param teamId the team id
     * @return the int
     */
    public int checkActivityNumOfTeam(String teamId) {
        int result = 0;
        for (Activity activity : activities) {

            for (Iterator<Team> iterator = activity.getTeams(); iterator.hasNext(); ) {
                Team team = iterator.next();
                if (team.getTeamId().equals(teamId)) {
                    result++;
                }
            }

        }
        return result;
    }

    public String toString() {
        String result = "";
        for (Activity activity : activities) {
            result += activity.toString() + "\n";

        }
        return result;
    }
}