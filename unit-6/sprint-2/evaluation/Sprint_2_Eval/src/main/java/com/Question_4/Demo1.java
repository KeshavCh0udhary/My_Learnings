package com.Question_4;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.emutil.EMUtil;

public class Demo1 {

	public static void main(String[] args) {
		EntityManager em = EMUtil.provideEntityManager();
		String jpql = "from SalariedEmployee";
		TypedQuery<SalariedEmployee> q = em.createQuery(jpql, SalariedEmployee.class);
		
		List<SalariedEmployee> se = q.getResultList();
		se.forEach(s->{
			System.out.println("Employee id is :"+ s.getEmpId());
			System.out.println("Employee Name is :"+ s.getEmpName());
			System.out.println("Employee email is :"+ s.getEmail());
			System.out.println("Employee salary is :"+ s.getSalary());
			System.out.println("================================");
		});
//		

	}

}
