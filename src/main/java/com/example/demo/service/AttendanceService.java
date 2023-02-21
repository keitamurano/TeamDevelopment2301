//DBにアクセスするためにリポジトリを呼び出す

package com.example.demo.service;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AttendanceEntity;
import com.example.demo.form.AttendanceForm;
import com.example.demo.repository.AttendanceRepository;

@Service
public class AttendanceService {

	//出勤報告のRepository
	@Autowired
	AttendanceRepository attendanceRepository;

	//エンティティ（データを格納する箱）を画面データに詰め替える
	public void insert(AttendanceForm attendanceForm) {
		AttendanceEntity attendanceEntity = new AttendanceEntity();
		attendanceEntity.setUserId(attendanceForm.getUserId());
		attendanceEntity.setStatus(attendanceForm.getStatus());
		attendanceEntity.setStartdate(attendanceForm.getStartdate());
		attendanceEntity.setStarttime(LocalTime.parse(attendanceForm.getStarttime().substring(0, 5) + ":00"));
		attendanceEntity.setRemarks(attendanceForm.getRemarks());
		attendanceEntity.setAttendance_ID(attendanceForm.getAttendance_ID());

		attendanceRepository.save(attendanceEntity);
	}
}