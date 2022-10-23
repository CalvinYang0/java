package imp;

import java.util.Date;

/**
 * The type Party activity.
 */
public class PartyActivity extends Activity {
    /**
     * Gets theme.
     *
     * @return the theme
     */
    public String getTheme() {
        return theme;
    }

    /**
     * Sets theme.
     *
     * @param theme the theme
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * Gets classification.
     *
     * @return the classification
     */
    public String getClassification() {
        return classification;
    }

    /**
     * Sets classification.
     *
     * @param classification the classification
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }

    private String theme;
    private String classification;

    @Override
    public String toString() {
        return super.toString() + "_" + theme + "_" + classification;
    }

    /**
     * Instantiates a new Party activity.
     *
     * @param id             the id
     * @param name           the name
     * @param startTime      the start time
     * @param endTime        the end time
     * @param description    the description
     * @param site           the site
     * @param theme          the theme
     * @param classification the classification
     */
    public PartyActivity(String id, String name, Date startTime, Date endTime, String description, String site, String theme, String classification) {
        super(id, name, startTime, endTime, description, site);
        this.theme = theme;
        this.classification = classification;
    }

    /**
     * Instantiates a new Party activity.
     *
     * @param id          the id
     * @param name        the name
     * @param startTime   the start time
     * @param endTime     the end time
     * @param description the description
     * @param site        the site
     */
    public PartyActivity(String id, String name, Date startTime, Date endTime, String description, String site) {
        super(id, name, startTime, endTime, description, site);
        setSite(site);
    }
}
