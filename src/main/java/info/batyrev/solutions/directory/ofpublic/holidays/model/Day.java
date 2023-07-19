package info.batyrev.solutions.directory.ofpublic.holidays.model;

import java.util.Date;

public class Day extends Entity {

    private Date date;

    private String name;

    private boolean isWorkingDay;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isWorkingDay() {
        return isWorkingDay;
    }

    public void setWorkingDay(boolean workingDay) {
        isWorkingDay = workingDay;
    }

    @Override
    public String toString() {
        return "Day[%s %s %s]".formatted(date, name, isWorkingDay);
    }
}
