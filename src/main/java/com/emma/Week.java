package com.emma;
import java.util.ArrayList;
import java.util.List;

public class Week {

    private List<String> days;

    public Week() {
        this.days = new ArrayList<>();
        this.days.add("Monday");
        this.days.add("Tuesday");
        this.days.add("Wednesday");
        this.days.add("Thursday");
        this.days.add("Friday");
        this.days.add("Saturday");
        this.days.add("Sunday");
    }

    public List<String> getDaysOfWeek() {
        return this.days;
    }
    public int getListSize() {
        return 0;
    }
    public boolean deleteDay(String day) {
        return false;
    }
    public void sort() {}
    public void clearList() {}

}
