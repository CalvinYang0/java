package imp;

/**
 * The type Organizer.
 */
public class Organizer extends User {
    private String unit;

    /**
     * Gets unit.
     *
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets unit.
     *
     * @param unit the unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Instantiates a new Organizer.
     *
     * @param id      the id
     * @param name    the name
     * @param phoneNo the phone no
     * @param email   the email
     * @param unit    the unit
     */
    public Organizer(String id, String name, String phoneNo, String email, String unit) {
        super(id, name, phoneNo, email);
        this.unit = unit;
    }

    @Override
    public String toString() {
        return super.toString() + "_" + unit;
    }
}
