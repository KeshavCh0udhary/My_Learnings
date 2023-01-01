package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.FIRException;
import com.masai.model.FIR;
import com.masai.repo.FIRRepo;

@Service
public class FIRServiceImpl implements FIRService {
	
	@Autowired
	private FIRRepo firRepo;
	
	@Override
	public FIR addFIR(FIR fir) throws FIRException {
		
		FIR newFir = firRepo.save(fir);
		
		if(newFir != null) return newFir;
		
		throw new FIRException("FIR cannot be saved");
	}

}
