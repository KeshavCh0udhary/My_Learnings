package com.Question_4;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.emutil.EMUtil;

public class Demo2 {

	public static void main(String[] args) {
		EntityManager em = EMUtil.provideEntityManager();
		String jpql = "from ConractualEmployee";
		TypedQuery<ConractualEmployee> q = em.createQuery(jpql, ConractualEmployee.class);
		
		List<ConractualEmployee> ce = q.getResultList();
		ce.forEach(c->{
			System.out.println(c);
		});

	}

}
