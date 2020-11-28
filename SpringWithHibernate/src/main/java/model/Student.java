package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="studentinfo2")
public class Student
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int roll;
	
	@NotBlank(message="required field....")
	@Column(name="sname",length=20)
	private String sname;
	
	@NotBlank(message="required field....")
	@Column(name="course",length=20)
	private String course;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	

}
