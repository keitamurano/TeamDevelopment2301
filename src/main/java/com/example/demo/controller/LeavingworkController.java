
package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.LeavingworkForm;
import com.example.demo.service.LeavingworkService;



//退勤報告コントローラー

@Controller
public class LeavingworkController{

//private LeavingworkService leavingworkService = new LeavingworkService();
	@Autowired
	   LeavingworkService leavingworkService;
	//(マイページから退勤画面を表示）
	  @GetMapping("/leavingwork")//退勤報告画面を表示する
	     public String leavingwork (Model model){
		  model.addAttribute("LeavingworkForm",new LeavingworkForm());
	         return "leavingwork"; //leaving.htmlに画面遷移
	     }
	  
  
//	//戻るボタン押下→マイページ画面に遷移する
//	 @GetMapping("/leavingbacktoMypage")
//	     public String back (Model model) {
//	         return "Mypage"; //Mypage.htmlに画面遷移
//	     }

	//登録ボタンを押下→マイページ画面に遷移する ??
	  @PostMapping("/Leavingwork")
	    public String create(@Validated @ModelAttribute LeavingworkForm leavingworkForm,BindingResult bindingResult,Model model) {
		  
		  if (bindingResult.hasErrors()) {
	      List<String> errorList = new ArrayList<String>();
	      for (ObjectError error : bindingResult.getAllErrors()) {
	        errorList.add(error.getDefaultMessage());
	      }
	      model.addAttribute("LeavingworkForm", leavingworkForm);
	      model.addAttribute("validationError", errorList);
	      model.addAttribute("LeavingworkForm",new LeavingworkForm());
	      return "/Leavingwork";
	    }
	    // ユーザー情報の登録
		  
		  leavingworkService.insert(leavingworkForm);
		  model.addAttribute("LeavingworkForm",leavingworkForm);
		  // leavingworkService.insert(leavingworkForm);
	         return "Mypage"; //attendance.htmlに画面遷移
	     }

}


//＠GetMappinrg…登録されているデータを取得する
//＠PostMapping…新しいデータを登録する
