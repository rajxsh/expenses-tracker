package com.SpringBootMVC.ExpensesTracker.DTO;

public class FilterDTO {
    private String category = "all";
    private int from = 0;
    private int to = 1000000; // Set a high default so all amounts are included
    private String month = "all";
    private String year = "all";

    public FilterDTO() {
        this.category = "all";
        this.from = 0;
        this.to = 1000000;
        this.month = "all";
        this.year = "all";
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Filter{" +
                "category='" + category + '\'' +
                ", from=" + from +
                ", to=" + to +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}