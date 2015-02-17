package ch.evren.android.time.model;

import java.util.Date;

/**
 * Created by Admin on 17.02.2015.
 */
public class Meeting extends Task {
    private Date startTime;
    private Date endTime;

    public Meeting() {
    }

    public Meeting(Double duration, String name, String description, Date startTime, Date endTime) {
        super(duration, name, description);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
