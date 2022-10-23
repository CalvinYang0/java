package imp;

import java.util.Date;

/**
 * The type Lecture activity.
 */
public class LectureActivity extends Activity {
    /**
     * The Key speaker.
     */
    String keySpeaker;

    /**
     * Gets key speaker.
     *
     * @return the key speaker
     */
    public String getKeySpeaker() {
        return keySpeaker;
    }

    /**
     * Sets key speaker.
     *
     * @param keySpeaker the key speaker
     */
    public void setKeySpeaker(String keySpeaker) {
        this.keySpeaker = keySpeaker;
    }

    @Override
    public String toString() {
        return super.toString() + "_" + keySpeaker;
    }

    /**
     * Instantiates a new Lecture activity.
     *
     * @param id          the id
     * @param name        the name
     * @param startTime   the start time
     * @param endTime     the end time
     * @param description the description
     * @param site        the site
     * @param keySpeaker  the key speaker
     */
    public LectureActivity(String id, String name, Date startTime, Date endTime, String description, String site, String keySpeaker) {
        super(id, name, startTime, endTime, description, site);
        this.keySpeaker = keySpeaker;
    }
}

