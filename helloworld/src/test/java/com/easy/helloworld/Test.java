package com.easy.helloworld;


import java.sql.Timestamp;
import java.util.*;

public class Test {
    public static void sortDateAndTimestamps() throws Exception {
        List<Date> dates = new ArrayList<>();
        dates.add(new Timestamp(1498612231223L));
        dates.add(new Timestamp(1498612231224L));
        dates.add(new Timestamp(1498612231225L));
        dates.add(new Timestamp(1498612231226L));
        dates.add(new Timestamp(1498612231227L));
        dates.add(new Timestamp(1498612231228L));
        dates.add(new Timestamp(1498612231229L));
        dates.add(new Timestamp(1498612231230L));
        dates.add(new Timestamp(1498612231231L));
        dates.add(new Timestamp(1498612231232L));
        dates.add(new Timestamp(1498612231233L));
        dates.add(new Date(1498621254605L));
        dates.add(new Timestamp(1498612231232L));
        dates.add(new Timestamp(1498612231233L));
        dates.add(new Date(1498612231533L));
        dates.add(new Date(1498612231633L));
        dates.add(new Date(1498612231733L));
        dates.add(new Date(1498612231833L));
        dates.add(new Date(1498612231933L));
        dates.add(new Timestamp(1498612231333L));
        dates.add(new Date(1498612231333L));
        dates.add(new Timestamp(1498612222333L));
        dates.add(new Date(1498621254611L));
        dates.add(new Timestamp(1498621254612L));
        dates.add(new Timestamp(1498621254613L));
        dates.add(new Date(1498621254607L));
        dates.add(new Timestamp(1498612222333L));
        dates.add(new Timestamp(1498612222333L));
        dates.add(new Timestamp(1498621254609L));
        dates.add(new Timestamp(1498621254611L));
        dates.add(new Date(1498612222333L));
        dates.add(new Date(1498612232333L));
        dates.add(new Timestamp(1498621254605L));
        for (int i = 0; i < 200; i++) {
            Collections.sort(dates);
        }
    }
    public static void main(String[] args) throws Exception {
        sortDateAndTimestamps();
    }

}
