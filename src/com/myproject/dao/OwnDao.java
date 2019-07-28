package com.myproject.dao;

import java.util.List;

import com.myproject.entity.MyOwnUser;
import com.myproject.entity.OwnBook;

public interface OwnDao {

	MyOwnUser userCheck(MyOwnUser theuser);

	void bookTrain(OwnBook thebook);

	List<OwnBook> getTrain();

	List<OwnBook> getTrainList();

	OwnBook getmylist(int bookid);

	String getCancel(int bookid);

	


	

	

	

	

	

}
