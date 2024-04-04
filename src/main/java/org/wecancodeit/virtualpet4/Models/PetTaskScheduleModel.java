package org.wecancodeit.virtualpet4.Models;

import java.util.*;

public class PetTaskScheduleModel {

    private long id;

    private long volunteerId;
    private long petId;
    private long taskId;

    private Date nextScheduledTime;

    public PetTaskScheduleModel() {
    }

    public PetTaskScheduleModel(long volunteerId, long petId, long taskId, Date nextScheduledTime) {
        this.volunteerId = volunteerId;
        this.petId = petId;
        this.taskId = taskId;
        this.nextScheduledTime = nextScheduledTime;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public long getVolunteerId() {
        return volunteerId;
    }

    public long getPetId() {
        return petId;
    }

    public long getTaskId() {
        return taskId;
    }

    public Date getNextScheduledTime() {
        return nextScheduledTime;
    }

    @Override
    public String toString() {
        return "ScheduleModel [id=" + id + ", VolunteerId=" + volunteerId + ", petId=" + petId + ", taskId=" + taskId
                + ", nextScheduledTime=" + nextScheduledTime + "]";
    }

}
