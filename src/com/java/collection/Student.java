package com.java.collection;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private double gpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("name:'").append(name).append("' gpa:").append(gpa);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getGpa() == student.getGpa() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getGpa());
    }

    @Override
    public int compareTo(Student o) {
//        return o.getName() - (this.getName());
        return Double.compare(o.getGpa(), this.getGpa());
    }
}
