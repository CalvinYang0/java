package imp;

import java.util.ArrayList;

/**
 * The type Student.
 */
public class Student extends User {
    private String studentNo;
    private boolean gender;
    private String grade;
    private String department;
    private ArrayList<Team> teams = new ArrayList<Team>();

    /**
     * Instantiates a new Student.
     *
     * @param Id         the id
     * @param name       the name
     * @param phoneNo    the phone no
     * @param email      the email
     * @param studentNo  the student no
     * @param gender     the gender
     * @param grade      the grade
     * @param department the department
     */
    public Student(String Id, String name, String phoneNo, String email, String studentNo, boolean gender, String grade, String department) {
        super(Id, name, phoneNo, email);
        setStudentNo(studentNo);
        setGender(gender);
        setGrade(grade);
        setDepartment(department);

    }


    /**
     * Gets student no.
     *
     * @return the student no
     */
    public String getStudentNo() {
        return studentNo;
    }

    /**
     * Sets student no.
     *
     * @param studentNo the student no
     */
    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    /**
     * Is gender boolean.
     *
     * @return the boolean
     */
    public boolean isGender() {
        return gender;
    }

    /**
     * Sets gender.
     *
     * @param gender the gender
     */
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    /**
     * Gets grade.
     *
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Sets grade.
     *
     * @param grade the grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
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
     * Get team list array list.
     *
     * @return the array list
     */
    public ArrayList<Team> getTeamList() {
        return teams;
    }

    @Override
    public String toString() {
        return super.toString() + "_" + studentNo + "_" + gender + "_" + grade + "_" + department;
    }


}
