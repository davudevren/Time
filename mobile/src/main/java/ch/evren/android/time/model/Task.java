package ch.evren.android.time.model;

/**
 * Created by Admin on 17.02.2015.
 */
public class Task {
    private Double duration; //duration in ms
    private String name;
    private String Description;

    public Task() {
    }

    public Task(Double duration, String name, String description) {
        this.duration = duration;
        this.name = name;
        Description = description;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}

