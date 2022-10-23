package imp;

import java.util.Date;

/**
 * The type Artistic activity.
 */
public class ArtisticActivity extends Activity {
    /**
     * The Type.
     */
    String type;

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "_" + type;
    }

    /**
     * Instantiates a new Artistic activity.
     *
     * @param id          the id
     * @param name        the name
     * @param startTime   the start time
     * @param endTime     the end time
     * @param description the description
     * @param site        the site
     * @param type        the type
     */
    public ArtisticActivity(String id, String name, Date startTime, Date endTime, String description, String site, String type) {
        super(id, name, startTime, endTime, description, site);
        this.type = type;
    }
}
