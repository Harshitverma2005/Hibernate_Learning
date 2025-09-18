package org.example;

import jakarta.persistence.*;

@Entity // to give Info to IDE to store that class
@Table(name = "STUDENT_TABLE")

public class Student {

    @Id  //Making RollNo Primary
    @Column(name = " ID")

    private int sRollNo;
@Column(name = "STUDENT_NAME")
    private String sName ;
@Transient
    private int sAge;

    public int getsRollNo() {
        return sRollNo;
    }

    public void setsRollNo(int sRollNo) {
        this.sRollNo = sRollNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("sRollNo=").append(sRollNo);
        sb.append(", sName='").append(sName).append('\'');
        sb.append(", sAge=").append(sAge);
        sb.append('}');
        return sb.toString();
    }
}
