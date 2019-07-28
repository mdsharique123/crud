package com.myproject.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myproject.entity.MyOwnUser;
import com.myproject.entity.OwnBook;


@Repository
public class OwnDaoImpl implements OwnDao {
	
	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public MyOwnUser userCheck(MyOwnUser theuser) {
		
		Session session= sessionfactory.getCurrentSession();
	    Query<MyOwnUser>userquery=session.createQuery("from MyOwnUser where username=:uname and password=:pswrd");
	    userquery.setParameter("uname",theuser.getUsername());
	    userquery.setParameter("pswrd",theuser.getPassword());
	    MyOwnUser oneuser=userquery.uniqueResult();
		
		return oneuser;
	}

	@Override
	public void bookTrain(OwnBook thebook) {
		
		Session session = sessionfactory.getCurrentSession();
		session.saveOrUpdate(thebook);
		
	}

	@Override
	public List<OwnBook> getTrain() {
		
		Session session= sessionfactory.getCurrentSession();
		Query<OwnBook>userquery=session.createQuery("from OwnBook",OwnBook.class);
	    List<OwnBook>userlist=userquery.list();
	    
		return userlist;
	}

	@Override
	public List<OwnBook> getTrainList() {
		
		Session session=sessionfactory.getCurrentSession();
		Query<OwnBook>userquery=session.createQuery("from OwnBook",OwnBook.class);
		List<OwnBook>userlist=userquery.list();
	
		return userlist;
	}

	@Override
	public OwnBook getmylist(int bookid) {
		Session session=sessionfactory.getCurrentSession();
	
		OwnBook myupdate=session.get(OwnBook.class,bookid);
		
		return myupdate;
	}

	@Override
	public String getCancel(int bookid) {
		
		Session session=sessionfactory.getCurrentSession();
		 OwnBook ownlist=session.get(OwnBook.class,bookid);
		 session.delete(ownlist);
		return  "yes";
	}

	

	
	
	

	
   


}
