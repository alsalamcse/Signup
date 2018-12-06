package com.awad.ekrma.ekrmataskmngr2018;

public class MyTask1 {
    private String key;// key:unique id for each object. have to be....
    private String title;
    private String text;
    private int important;
    private int necessary;
    private long createdAT;
    private long dueDate;
    public String owner;

    public MyTask1() {

    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText(String text1) {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImportant() {
        return important;
    }

    public void setImportant(int important) {
        this.important = important;
    }

    public int getNecessary() {
        return necessary;
    }

    public void setNecessary(int necessary) {
        this.necessary = necessary;
    }

    public long getCreatedAT(long date) {
        return createdAT;
    }

    public void setCreatedAT(long createdAT) {
        this.createdAT = createdAT;
    }

    public long getDueDate() {
        return dueDate;
    }

    public void setDueDate(long dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "MyTask{" +
                "key='" + key + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", important=" + important +
                ", necessary=" + necessary +
                ", createdAT=" + createdAT +
                ", dueDate=" + dueDate +
                '}';
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void getText() {
    }

    public static void add(MyTask1 task1) {
    }

    public class ITEMS {
    }
}



