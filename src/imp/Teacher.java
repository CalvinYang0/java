package imp;

/**
 * The type Teacher.
 */
public class Teacher extends User {
    private String teacherNo;
    private String department;

    /**
     * Gets teacher no.
     *
     * @return the teacher no
     */
    public String getTeacherNo() {
        return teacherNo;
    }

    /**
     * Sets teacher no.
     *
     * @param teacherNo the teacher no
     */
    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo;
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

    @Override
    public String toString() {
        return super.toString() + "_" + teacherNo + "_" + department;
    }

    /**
     * Instantiates a new Teacher.
     *
     * @param id         the id
     * @param name       the name
     * @param phoneNo    the phone no
     * @param email      the email
     * @param teacherNo  the teacher no
     * @param department the department
     */
    public Teacher(String id, String name, String phoneNo, String email, String teacherNo, String department) {
        super(id, name, phoneNo, email);
        this.teacherNo = teacherNo;
        this.department = department;
    }
}
