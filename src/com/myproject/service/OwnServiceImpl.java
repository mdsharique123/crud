package com.myproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.dao.OwnDao;
import com.myproject.entity.MyOwnUser;
import com.myproject.entity.OwnBook;

@Service
public class OwnServiceImpl implements OwnService {
	
	@Autowired
	private OwnDao owndao;

	@Transactional
	@Override
	public MyOwnUser userCheck(MyOwnUser theuser) {
		
		return owndao.userCheck(theuser);
	}
    @Transactional
	@Override
	public void bookTrain(OwnBook thebook) {
		
		owndao.bookTrain(thebook);
		
	}
    @Transactional
	@Override
	public List<OwnBook> getTrain() {
		
		
	
		
		return owndao.getTrain();
	}
    @Transactional
	@Override
	public List<OwnBook> getTrainList() {
		
		return owndao.getTrainList();
	}
    @Transactional
	@Override
	public OwnBook getmylist(int bookid) {
		
		return owndao.getmylist(bookid);
	}
    @Transactional
	@Override
	public String getCancel(int bookid) {
		
		return owndao.getCancel(bookid);
	}
   
   
    
  
	
 
	
  

}
