
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller

public class MypageController {

	
	 @GetMapping(value ="/mypage")
	  public String mypage(/**@RequestParam String name, String userID, **/Model model) {
		// model.addAllAttributes("name",name,"userID",userID);
	    return "Mypage";
	  }
	 
		 
	  @PostMapping("/edit")
	  public String postEdit(/**@RequestParam String name, String userID, **/Model model) {
		// model.addAllAttributes("name",name,"userID",userID);
		  return "edit";
	  }
	  
	  @PostMapping("/attendance"/**path="/mypage", params = "attendance-button"**/)
	  public String postAttendance(/**@RequestParam String name, String userID, **/Model model) {
		// model.addAllAttributes("name",name,"userID",userID);
		  return "attendance";
	  }
	  
	  @PostMapping("/leavingwork"/**path="/mypage", params = "leavingwork-button"**/)
	  public String postLeavingwork(/**@RequestParam String name, String userID, **/Model model) {
		// model.addAllAttributes("name",name,"userID",userID);
		  return "leavingwork";
	  }
	  
	  @GetMapping("/create" /** path="/mypage", params = "create-button"**/)
	  public String postCreate(/**@RequestParam String name, String userID, **/Model model) {
		// model.addAllAttributes("name",name,"userID",userID);
		  return "create";
	  }
	  
	  @GetMapping("/create2" /**path="/mypage", params = "create2-button"**/)
	  public String postCreate2(/**@RequestParam String name, String userID, **/Model model) {
		// model.addAllAttributes("name",name,"userID",userID);
		  return "create2";
	  }
	  
	  @PostMapping("/top" /**path="/mypage", params = "expences-button"**/)
	  public String postExpences(/**@RequestParam String name, String userID, **/Model model) {
		// model.addAllAttributes("name",name,"userID",userID);
		  return "expences";
	  }
	  
	  @PostMapping("/top2" /**path="/mypage", params = "expanceslist-button"**/)
	  public String postExpanceslist(/**@RequestParam String name, String userID, **/Model model) {
		// model.addAllAttributes("name",name,"userID",userID);
		  return "expenceslist";
	  }
	  
	  @PostMapping("/paid/list" /**path="/mypage", params = "paidlist-button"**/)
	  public String postPaidlist(/**@RequestParam String userID, **/Model model) {
		// model.addAllAttributes("name",name,"userID",userID);
		  return "Paid";
	  }
	
}

