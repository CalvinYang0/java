package imp;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * The type Activity.
 */
public abstract class Activity {
    private String id;
    private String name;
    private Date startTime;
    private Date endTime;
    private String description;
    private String site;
    private ArrayList<Organizer> organizers = new ArrayList<Organizer>();
    private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    private ArrayList<Team> teams = new ArrayList<Team>();

    /**
     * Get id string.
     *
     * @return the string
     */
    public String getId() {
        return id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets start time.
     *
     * @return the start time
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * Gets end time.
     *
     * @return the end time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets site.
     *
     * @return the site
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets start time.
     *
     * @param startTime the start time
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * Sets end time.
     *
     * @param endTime the end time
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets site.
     *
     * @param site the site
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * Add team to activity.
     *
     * @param team the team
     */
    public void addTeamToActivity(Team team) {
        teams.add(team);
    }

    /**
     * Remove team from activity.
     *
     * @param team the team
     */
    public void removeTeamFromActivity(Team team) {
        teams.remove(team);
    }

    /**
     * Remove team from activity.
     *
     * @param Id the id
     */
    public void removeTeamFromActivity(String Id) {
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).getTeamId().equals(Id)) {
                teams.remove(i);
            }
        }
    }

    /**
     * Set team in activity.
     *
     * @param index the index
     * @param team  the team
     */
    public void setTeamInActivity(int index, Team team) {
        teams.set(index, team);
    }

    /**
     * Get team count int.
     *
     * @return the int
     */
    public int getTeamCount() {
        return teams.size();
    }

    /**
     * Set organizer in activity.
     *
     * @param index     the index
     * @param organizer the organizer
     */
    public void setOrganizerInActivity(int index, Organizer organizer) {
        organizers.set(index, organizer);
    }

    /**
     * Add organizer to activity.
     *
     * @param organizer the organizer
     */
    public void addOrganizerToActivity(Organizer organizer) {
        organizers.add(organizer);
    }

    /**
     * Remove organizer from activity.
     *
     * @param organizer the organizer
     */
    public void removeOrganizerFromActivity(Organizer organizer) {
        organizers.remove(organizer);
    }

    /**
     * Remove organizer from activity.
     *
     * @param Id the id
     */
    public void removeOrganizerFromActivity(String Id) {
        for (int i = 0; i < organizers.size(); i++) {
            if (organizers.get(i).getId().equals(Id)) {
                organizers.remove(i);
            }
        }
    }

    /**
     * Get organizer count int.
     *
     * @return the int
     */
    public int getOrganizerCount() {
        return organizers.size();
    }

    /**
     * Set teacher in activity.
     *
     * @param index   the index
     * @param teacher the teacher
     */
    public void setTeacherInActivity(int index, Teacher teacher) {
        teachers.set(index, teacher);
    }

    /**
     * Add teacher to activity.
     *
     * @param teacher the teacher
     */
    public void addTeacherToActivity(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * Remove teacher from activity.
     *
     * @param teacher the teacher
     */
    public void removeTeacherFromActivity(Teacher teacher) {
        teachers.remove(teacher);
    }

    /**
     * Remove teacher from activity.
     *
     * @param Id the id
     */
    public void removeTeacherFromActivity(String Id) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId().equals(Id)) {
                teachers.remove(i);
            }
        }
    }

    /**
     * Get teacher count int.
     *
     * @return the int
     */
    public int getTeacherCount() {
        return teachers.size();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getId().equals(this.getId())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Get teams iterator.
     *
     * @return the iterator
     */
    public Iterator<Team> getTeams() {
        return teams.iterator();
    }

    /**
     * Get organizers iterator.
     *
     * @return the iterator
     */
    public Iterator<Organizer> getOrganizers() {
        return organizers.iterator();
    }

    /**
     * Get teachers iterator.
     *
     * @return the iterator
     */
    public Iterator<Teacher> getTeachers() {
        return teachers.iterator();
    }

    @Override
    public String toString() {
        return name + "_" + startTime + "_" + endTime + "_" + description + "_" + site;
    }

    /**
     * Instantiates a new Activity.
     *
     * @param id          the id
     * @param name        the name
     * @param startTime   the start time
     * @param endTime     the end time
     * @param description the description
     * @param site        the site
     */
    public Activity(String id, String name, Date startTime, Date endTime, String description, String site) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
        this.site = site;
    }
}
