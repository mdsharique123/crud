package com.myproject.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myproject.entity.MyOwnUser;
import com.myproject.entity.OwnBook;
import com.myproject.service.OwnService;

@Controller
public class OwnController {
	
	@Autowired
    private OwnService ownservice;
	
	
	
	@RequestMapping("/")
	public String showForm(Model model){
		
		MyOwnUser myownuser= new MyOwnUser();
		model.addAttribute("store",myownuser);
		
		return "myhome";
	}
		
		@RequestMapping("/processForm")
		public String processForm(@ModelAttribute("store") MyOwnUser theuser) {
			
			MyOwnUser loguser =ownservice.userCheck(theuser);
			
			if(theuser.getUsername().equals (loguser.getUsername()) && (theuser.getPassword().equals (loguser.getPassword()))){
				
	
		}
			return "myconfirmation";
		
		
	}
	
	
	
	
	@RequestMapping("/book")
	public String bookTrain(Model model) {
		
		OwnBook ownbook= new OwnBook();
		model.addAttribute("store",ownbook);
		
		
		return "ownbookdetails";
		
		
		
	}
	
	@RequestMapping("/processBookTrain")
	public String processbooktrain(@ModelAttribute("store") OwnBook thebook, Model model) {
		
		ownservice.bookTrain(thebook);
		
	    model.addAttribute("message","data saved successfully");
		
		return "confirmationbook";
		

	}
	
	@RequestMapping("/view")
    public String view(Model model) {
	
		List<OwnBook>gettrainlist=ownservice.getTrain();
		model.addAttribute("listtrain", gettrainlist);
				
				
		return "listdetails";
	}
	
    @RequestMapping("/update")
    public String Update(Model model) {
	
	List<OwnBook>trainlist=ownservice.getTrainList();
	model.addAttribute("trainList",trainlist);
	
	return "updatelist";
	
	
}
   @RequestMapping("/showUpdate")
   public String showUpdate(@RequestParam("customerId") int bookid,Model model) {
	   
	OwnBook  mylist= ownservice.getmylist(bookid);
	model.addAttribute("data",mylist);
	
	return "booktrain";
	   
	   
	   
   }
   
    	
    
    	
    	
    
    
   @RequestMapping("/cancel")
   public String Cancel(Model model) {
	OwnBook ownbook = new OwnBook();
	model.addAttribute("storebook",ownbook);
	   
	return "cancelpage";
	   
	   
	   
   }
   
   @RequestMapping("/processCancelTrain")
   public String processCancelTrain(@ModelAttribute("storebook") OwnBook mybook, Model model) {
	   
	 int bookid=mybook.getBookid();
	 String mycancel = ownservice.getCancel(bookid);
	 
	 if(mycancel.equals("yes")) {
		 
		 model.addAttribute("message","Cancel Train successfully");
	 }
	   
	   
	   
	   
	   
	   
	return "canceldonepage";
	   
	   
	   
   }
   
    
   
}
