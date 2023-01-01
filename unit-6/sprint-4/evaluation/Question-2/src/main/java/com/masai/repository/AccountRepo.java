package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masai.model.Account;
import com.masai.model.AccountDTO;

    @Repository
    public interface AccountRepo extends JpaRepository<Account, Integer>{

	
	public List<Account> findByMarks(Integer marks);
	
	public Account findByAddress(String address);
	

	@Query("select s.name from Student s where s.roll=?1")        
	public String getStudentNameByRoll(Integer roll);

	@Query("select s.name,s.marks from Student s where s.address =?1")
	public List<String> getNameAndMarksByAddress(String address);
	
	
	@Query("select new com.masai.model.StudentDTO(s.name,s.marks) from Student s where s.address =?1")
	public List<AccountDTO> getNameAndMarksByAddress2(String address);
	
	
	
}
