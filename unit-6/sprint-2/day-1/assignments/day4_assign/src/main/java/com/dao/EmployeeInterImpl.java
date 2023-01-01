package com.dao;

import javax.persistence.EntityManager;

import com.bean.Employee;
import com.exceptions.EmployeeException;
import com.utility.EntityManagerUtil;

public class EmployeeInterImpl implements EmployeeInter {

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {

		EntityManager em = EntityManagerUtil.provideEntityManager();

		if (employee != null) {

			em.getTransaction().begin();
			em.persist(employee);
			em.getTransaction().commit();

			return employee;
		} else {
			throw new EmployeeException("Incorrect Details......");
		}

	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee emp = null;

		EntityManager em = EntityManagerUtil.provideEntityManager();

		emp = em.find(Employee.class, empId);

		if (emp != null) {
			return emp;
		} else {
			throw new EmployeeException("NO Employee Exist With This Id....");
		}

	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		Employee emp = null;

		EntityManager em = EntityManagerUtil.provideEntityManager();
		emp = em.find(Employee.class, empId);

		if (emp != null) {
			// Employee emp1 = emp;
			em.getTransaction().begin();
			em.remove(emp);
			// return
			em.getTransaction().commit();

		} else {
			throw new EmployeeException("No employee found......");
		}

		return emp;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		Employee emp = null;

		EntityManager em = EntityManagerUtil.provideEntityManager();

		emp = em.find(Employee.class, employee.getEmpid());

		if (emp != null) {
			em.getTransaction().begin();
			em.merge(employee);
			em.getTransaction().commit();

			return emp;
		} else {
			throw new EmployeeException("Incorrect account details.....");
		}

	}

}
