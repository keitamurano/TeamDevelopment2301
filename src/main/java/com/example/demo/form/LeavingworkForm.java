/*
//フォームクラスは画面とコントローラークラスの間で値を渡す役割をする

package com.example.demo.form;

import java.sql.Date;
import java.sql.Time;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class LeavingworkForm{
	
	@NotNull
	private Integer userId;

	@NotNull
	private  String status;

	@NotNull
	private  Date startdate;

	@NotNull
	private  Time starttime;
	
	@NotNull
	private  Date enddate;

	@NotNull
	private  Time endtime;
	
	@NotNull
	private  Time breaktime;

	@NotNull
	private  String remarks;

	public String getRemarks() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	}
	
	//attendance_ID integer(20) NOTNULL,
*/