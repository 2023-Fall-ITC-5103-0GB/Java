package assignment2_sem_2;

import java.io.*;


public class Student {

    private int studentID;
    private String name;
    private double GPA;
    
    public Student(int studentID, String name, double GPA) {
        this.studentID = studentID;
        this.name = name;
        this.GPA = GPA;
    }
    
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
    public byte[] toByteArray() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        

        dataOutputStream.writeInt(studentID);
        dataOutputStream.writeUTF(name);
        dataOutputStream.writeDouble(GPA);
        
        dataOutputStream.close();
        
        return byteArrayOutputStream.toByteArray();
    }
    
    
    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", name='" + name + '\'' + ", GPA=" + GPA +'}';
    }

    
}

