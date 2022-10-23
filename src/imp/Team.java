package imp;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Team.
 */
public class Team {
    private String teamId;
    private String teamName;
    private String department;
    private Student creator;
    /**
     * The Students.
     */
    ArrayList<Student> students = new ArrayList<Student>();
    /**
     * The Teachers.
     */
    ArrayList<Teacher> teachers = new ArrayList<Teacher>();

    /**
     * Gets team id.
     *
     * @return the team id
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * Sets team id.
     *
     * @param teamId the team id
     */
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    /**
     * Gets team name.
     *
     * @return the team name
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Sets team name.
     *
     * @param teamName the team name
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * Gets department.
     *
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets department.
     *
     * @param department the department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Gets creator.
     *
     * @return the creator
     */
    public Student getCreator() {
        return creator;
    }

    /**
     * Sets creator.
     *
     * @param creator the creator
     */
    public void setCreator(Student creator) {
        this.creator = creator;
    }

    /**
     * Get student list list.
     *
     * @return the list
     */
    public List<Student> getStudentList() {
        return (List<Student>) students;
    }

    /**
     * Get teacher list list.
     *
     * @return the list
     */
    public List<Teacher> getTeacherList() {
        return (List<Teacher>) teachers;
    }

    /**
     * Add student.
     *
     * @param student the student
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Add teacher.
     *
     * @param teacher the teacher
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }


}
