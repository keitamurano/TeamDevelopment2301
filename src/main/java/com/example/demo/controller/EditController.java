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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.UserEntity;
import com.example.demo.form.UserRequestForm;
import com.example.demo.service.EditService;

@Controller

public class EditController {
	
	@Autowired
	EditService editService;

	/**
	 * ユーザー情報詳細画面を表示
	 * @param id 表示するユーザーID
	 * @param model Model
	 * @return ユーザー情報詳細画面
	 */
	@GetMapping("/user/edit/{user_id}")
	public String displayAdd(@PathVariable Integer user_id, Model model) {
		UserEntity user = editService.findById(user_id);
		UserRequestForm userRequestForm = new UserRequestForm();
		userRequestForm.setUser_id(user.getUser_id());
		userRequestForm.setName(user.getName());
		userRequestForm.setName_kana(user.getName_kana());
		userRequestForm.setMail_address(user.getMail_address());
		userRequestForm.setPassword(user.getPassword());

		model.addAttribute("userRequestForm", userRequestForm);
		return "/edit";
	}

	/**
	 * ユーザー情報削除
	 * @param id 表示するユーザーID
	 * @param model Model
	 * @return ユーザー情報詳細画面
	 */
	@PostMapping("/user/edit/delete")
	public String delete(Integer user_id,UserRequestForm userRequestForm, Model model) {
		// ユーザー情報の削除
		editService.delete(user_id);
		return "/Mypage";
	}

	/**
	 * ユーザー更新（編集)
	 * @param userRequestForm リクエストデータ
	 * @param model Model
	 * @return ユーザー情報詳細画面
	 */
	@PostMapping("/user/update")
	public String update(@Validated @ModelAttribute UserRequestForm userRequestForm, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<String> errorList = new ArrayList<String>();
			for (ObjectError error : result.getAllErrors()) {
				errorList.add(error.getDefaultMessage());
			}
			model.addAttribute("userRequestForm", userRequestForm);
			model.addAttribute("validationError", errorList);
			return "/edit";
		}
		// ユーザー情報の更新
		editService.update(userRequestForm);
		model.addAttribute("userRequestForm", userRequestForm);
		return "/Mypage";
	}
}
