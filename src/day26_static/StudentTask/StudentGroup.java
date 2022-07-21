package day26_static.StudentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentGroup {  //StudentsGroup Has A Student - has relationship

    public String groupName;
    public int groupId;
    // create a multiple students:
    // array -size is not changeable, ArrayList - yes, can change
    public ArrayList<Student> students = new ArrayList<>(); // create an arraylist object!!! to be able to add multiple student
                                                            // object in the group

    // 2. create an ArrayList object when generate a constructor but not a good option


    public StudentGroup(String groupName, int groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
       // students = new ArrayList<>(); // size is 0 at the beginning
    }
    // add student function , create instance method, each object have it's own method


    public void addStudent(Student student){ // you have to have a student object(argument)
        // takes one student object and adds it to the arrayList of students
        students.add(student);

    }
    public void addStudents(Student[] students){
        this.students.addAll(Arrays.asList(students));
    }
    // second way, overload this method, takes one array of students, and adds the array of students to arrayList

    public void addStudent(String name, int age, char gender, String id){
        // takes name, age, gender, id of student info, creates

        // Student student = new Student(name, age, gender, id); // this method create a student object
        // student.add(student);
        students.add(new Student(name, age, gender, id));
    }
    // remove student from arrayList, by ID

    public void removeStudent(String id){
        students.removeIf(p -> p.id.equals(id)); //if student with id has this id, removes the student object
                                                 //with specified ID
    }
    // every time the student object is passed, I need to print their name, id, arrayList - total number of students


    public String toString() {
        return "StudentGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", students=" + students.size() + //total number of students
                '}';
    }
}
/*
 Create a custom class named StudentsGroup
            Attributes:
                groupName
                groupId
                students (ArrayList<Students>)

            Add a constructor that can set the groupId and groupName
                    initialize students arraylist in the constructor's body

            Methods:
                addStudent(Student): adds the specified student to the students arrayList
                removeStudent(id): removes the student with the specified id from the students arraylist
                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement

 */