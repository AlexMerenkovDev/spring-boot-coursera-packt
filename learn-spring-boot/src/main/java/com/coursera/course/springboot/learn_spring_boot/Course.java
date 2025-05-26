package com.coursera.course.springboot.learn_spring_boot;

public class Course {
    int id;
    String course;
    String author;

    public Course(int id, String course, String author) {
        super();
        this.id = id;
        this.course = course;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", course='" + course + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
