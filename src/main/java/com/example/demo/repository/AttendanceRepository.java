
//データベースにアクセスをする

//出勤報告のRepositoryクラス

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AttendanceEntity;

@Repository
public interface AttendanceRepository extends JpaRepository<AttendanceEntity, Integer> {

//	void save(AttendanceEntity attendanceEntity);←不要

}

/*
 * JpaRepositiry…インターフェイスのこと インターフェイスに検索メソッドを定義しておくことで
 * メソッドを呼び出すだけでスマートにデータ検索ができる。
 */