package com.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int collegeid;
	private String Collegename;
	private String collegeAddtrss;
	@OneToMany(mappedBy = "studentRoll",cascade = CascadeType.ALL)
	private List<Student> stdnts = new ArrayList<>();

	public List<Student> getStdnts() {
		return stdnts;
	}

	public void setStdnts(List<Student> stdnts) {
		this.stdnts = stdnts;
	}

	public College(String collegename, String collegeAddtrss) {
		super();
		Collegename = collegename;
		this.collegeAddtrss = collegeAddtrss;
	}

	public int getCollegeid() {
		return collegeid;
	}

	public void setCollegeid(int collegeid) {
		this.collegeid = collegeid;
	}

	public String getCollegename() {
		return Collegename;
	}

	public void setCollegename(String collegename) {
		Collegename = collegename;
	}

	public String getCollegeAddtrss() {
		return collegeAddtrss;
	}

	public void setCollegeAddtrss(String collegeAddtrss) {
		this.collegeAddtrss = collegeAddtrss;
	}

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

}
