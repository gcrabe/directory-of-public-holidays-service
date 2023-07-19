package info.batyrev.solutions.directory.ofpublic.holidays.model;

import java.util.Arrays;
import java.util.List;

public class Dictionary extends Entity {

    private Location location;

    private int year;

    private int month;

    List<Day> days;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public List<Day> getDays() {
        return days;
    }

    public void setDays(List<Day> days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Dictionary[" + location.toString()
                + " " + year
                + " " + month
                + " " + Arrays.toString(days.toArray())
                + "]";
    }
}
