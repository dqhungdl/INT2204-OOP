package com.uet.int2204.Week2;

public class Student {

    private String name;

    private String id;

    private String group;

    private String email;

    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    public Student(Student student) {
        this.name = student.name;
        this.id = student.id;
        this.group = student.group;
        this.email = student.email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public String getInfo() {
        return this.name + " - " + this.id + " - " + this.group + " - " + this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
