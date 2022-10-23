package imp;

import java.util.ArrayList;

/**
 * The type User sub system.
 */
public class UserSubSystem {
    private ArrayList<User> users = new ArrayList<User>();

    /**
     * Add user.
     *
     * @param user the user
     */
    public void addUser(User user) {
        users.add(user);
    }

    /**
     * Add student.
     *
     * @param student the student
     */
    public void addStudent(Student student) {
        //print whether the student is NULl

        users.add(student);
    }

    /**
     * Add teacher.
     *
     * @param teacher the teacher
     */
    public void addTeacher(Teacher teacher) {
        users.add(teacher);
    }

    /**
     * Add organizer.
     *
     * @param organizer the organizer
     */
    public void addOrganizer(Organizer organizer) {
        users.add(organizer);
    }

    /**
     * Remove student by id.
     *
     * @param id the id
     */
    public void removeStudentById(String id) {
        for (User user : users) {
            if (user instanceof Student) {
                if (user.getId().equals(id)) {
                    users.remove(user);
                    break;
                }
            }
        }
    }

    /**
     * Gets student by id.
     *
     * @param id the id
     * @return the student by id
     */
    public Student getStudentById(String id) {
        for (User user : users) {
            if (user instanceof Student) {
                if (user.getId().equals(id)) {
                    return (Student) user;
                }
            }
        }
        return null;
    }

    /**
     * Gets student list.
     *
     * @return the student list
     */
    public ArrayList<Student> getStudentList() {
        ArrayList<Student> result = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Student) {
                result.add((Student) user);
            }
        }
        return result;

    }

    /**
     * Remove organizer by id.
     *
     * @param id the id
     */
    public void removeOrganizerById(String id) {
        for (User user : users) {
            if (user instanceof Organizer) {
                if (user.getId().equals(id)) {
                    users.remove(user);
                    break;
                }
            }
        }
    }

    /**
     * Gets organizer by id.
     *
     * @param id the id
     * @return the organizer by id
     */
    public Organizer getOrganizerById(String id) {
        for (User user : users) {
            if (user instanceof Organizer) {
                if (user.getId().equals(id)) {
                    return (Organizer) user;
                }
            }
        }
        return null;
    }

    /**
     * Gets organizer list.
     *
     * @return the organizer list
     */
    public ArrayList<Organizer> getOrganizerList() {
        ArrayList<Organizer> result = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Organizer) {
                result.add((Organizer) user);
            }
        }
        return result;
    }

    /**
     * Remove teacher by id.
     *
     * @param id the id
     */
    public void removeTeacherById(String id) {
        for (User user : users) {
            if (user instanceof Teacher) {
                if (user.getId().equals(id)) {
                    users.remove(user);
                    break;
                }
            }
        }
    }

    /**
     * Gets teacher by id.
     *
     * @param id the id
     * @return the teacher by id
     */
    public Teacher getTeacherById(String id) {
        for (User user : users) {
            if (user instanceof Teacher) {
                if (user.getId().equals(id)) {
                    return (Teacher) user;
                }
            }
        }
        return null;
    }

    /**
     * Gets teacher list.
     *
     * @return the teacher list
     */
    public ArrayList<Teacher> getTeacherList() {
        ArrayList<Teacher> result = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Teacher) {
                result.add((Teacher) user);
            }
        }
        return result;
    }

    /**
     * Create team.
     *
     * @param creatorId  the creator id
     * @param teamId     the team id
     * @param teamName   the team name
     * @param department the department
     */
    public void createTeam(String creatorId, String teamId, String teamName, String department) {
        Student creator = getStudentById(creatorId);
        Team team = new Team();
        team.setCreator(creator);
        team.setDepartment(department);
        team.setTeamId(teamId);
        team.setTeamName(teamName);
        creator.getTeamList().add(team);
    }

    /**
     * Add student to team.
     *
     * @param creatorId the creator id
     * @param StudentId the student id
     * @param teamId    the team id
     */
    public void addStudentToTeam(String creatorId, String StudentId, String teamId) {
        for (Student student : getStudentList()) {
            if (student.getId().equals(creatorId)) {
                for (Team team : student.getTeamList()) {
                    if (team.getTeamId().equals(teamId)) {
                        team.getStudentList().add(getStudentById(StudentId));
                    }
                }
            }
        }
    }

    /**
     * Add teacher to team.
     *
     * @param creatorId the creator id
     * @param TeacherId the teacher id
     * @param teamId    the team id
     */
    public void addTeacherToTeam(String creatorId, String TeacherId, String teamId) {
        for (Student student : getStudentList()) {
            if (student.getId().equals(creatorId)) {
                for (Team team : student.getTeamList()) {
                    if (team.getTeamId().equals(teamId)) {
                        team.getTeacherList().add(getTeacherById(TeacherId));
                    }
                }
            }
        }
    }

    public String toString() {
        String result = "";
        for (User user : users) {
            result += user.toString() + "\n";
        }
        return result;
    }
}
