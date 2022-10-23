package imp;

/**
 * The type User.
 */
public abstract class User {
    private String id;
    private String name;
    private String phoneNo;
    private String email;

    /**
     * Instantiates a new User.
     *
     * @param id      the id
     * @param name    the name
     * @param phoneNo the phone no
     * @param email   the email
     */
    public User(String id, String name, String phoneNo, String email) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
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
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
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
     * Gets phone no.
     *
     * @return the phone no
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * Sets phone no.
     *
     * @param phoneNo the phone no
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return id + "_" + name + "_" + phoneNo + "_" + email;
    }

    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User user = (User) obj;
            if (this.id.equals(user.id)) {
                return true;
            }
        }
        return false;
    }
}
