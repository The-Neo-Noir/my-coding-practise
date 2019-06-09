package com.aneonoir.dsalgo.practise.queue;

import java.util.*;

class Priorities {

    PriorityQueue<Student> que;

    public List<Student> getStudents(List<String> events) {
        que = new PriorityQueue<>(events.size(), new StudentPriorityComparator());
        events.forEach(
                (event)
                        -> {
                    String[] son = event.split(" ");
                    if (son[0].equals("ENTER")) {
                        que.add(new Student(Integer.valueOf(son[3]).intValue(), son[1], Double.valueOf(son[2]).doubleValue()));
                    } else {
                        que.poll();
                    }

                }
        );
        List<Student> list = new ArrayList<>();
        Student a[] = que.toArray(new Student[que.size()]);
        Arrays.sort(a, new StudentPriorityComparator());
        //toString()
        return Arrays.asList(a);

    }
}

class StudentPriorityComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int returnValue = Double.valueOf(o1.getCgpa()).compareTo(Double.valueOf(o2.getCgpa()));
        if (returnValue == 0) {
            returnValue = o1.getName().compareTo(o2.getName());
            if (returnValue == 0) {
                returnValue = Integer.valueOf(o1.getId()).compareTo(Integer.valueOf(o2.getId()));
            }
            return returnValue;
        } else {
            return returnValue * -1;
        }
    }


}

class Student {

    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return getName();
    }

}
