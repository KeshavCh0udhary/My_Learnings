package com.Q1;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PartTimeExmployee {

	private int salaryPerHours;
	private int consultant_code;
	public int getSalaryPerHours() {
		return salaryPerHours;
	}
	public void setSalaryPerHours(int salaryPerHours) {
		this.salaryPerHours = salaryPerHours;
	}
	public int getConsultant_code() {
		return consultant_code;
	}
	public void setConsultant_code(int consultant_code) {
		this.consultant_code = consultant_code;
	}
	public PartTimeExmployee(int salaryPerHours, int consultant_code) {
		super();
		this.salaryPerHours = salaryPerHours;
		this.consultant_code = consultant_code;
	}
	@Override
	public String toString() {
		return "PartTimeExmployee [salaryPerHours=" + salaryPerHours + ", consultant_code=" + consultant_code + "]";
	}
	
	private void writeObject(ObjectOutputStream out) throws IOException 
    { 
        throw new NotSerializableException("not able"); 
    } 
	
	private void readObject(ObjectInputStream in) throws IOException{
		throw new NotSerializableException("not able");
	}

}
