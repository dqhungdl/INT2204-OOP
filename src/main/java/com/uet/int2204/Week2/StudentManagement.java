package com.uet.int2204.Week2;

public class StudentManagement {

    private int cntStudents = 0;
    private Student[] students = new Student[100];

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public void addStudent(Student newStudent) {
        students[cntStudents++] = newStudent;
    }

    public String studentsByGroup() {
        boolean[] isMark = new boolean[cntStudents];
        for (int i = 0; i < cntStudents; i++)
            isMark[i] = false;
        String rs = "";
        for (int i = 0; i < cntStudents; i++)
            if (!isMark[i]) {
                if (i == 0)
                    rs += students[i].getGroup();
                else
                    rs += "\n" + students[i].getGroup();
                for (int j = i; j < cntStudents; j++)
                    if (sameGroup(students[i], students[j])) {
                        isMark[j] = true;
                        rs += "\n" + students[j].getInfo();
                    }
            }
        return rs;
    }

    public void removeStudent(String id) {
        for (int i = 0; i < cntStudents; i++)
            if (students[i].getId().equals(id)) {
                for (int j = i; j < cntStudents - 1; j++)
                    students[j] = students[j + 1];
                cntStudents--;
                break;
            }
    }

    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Student student1 = new Student();
        student1.setName("Nguyen Van An");
        student1.setId("17020001");
        student1.setGroup("K62CC");
        student1.setEmail("17020001@vnu.edu.vn");
        studentManagement.addStudent(student1);
        Student student2 = new Student();
        student2.setName("Nguyen Van B");
        student2.setId("17020002");
        student2.setGroup("K62CC");
        student2.setEmail("17020002@vnu.edu.vn");
        studentManagement.addStudent(student2);
        studentManagement.addStudent(new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn"));
        studentManagement.addStudent(new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn"));
        System.out.println(studentManagement.studentsByGroup());
    }
}
