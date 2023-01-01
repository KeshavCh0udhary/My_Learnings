package com.ecom.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.models.Email;
@Repository
public interface EmailRepo extends JpaRepository<Email, Integer> {

}
