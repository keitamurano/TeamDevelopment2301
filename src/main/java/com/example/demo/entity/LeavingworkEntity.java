/*DBのレコードを表現するJavaクラス
 * データの入れ物となるクラス（DBの行に対応するように作成する）*/
//データベースから取得したデータを格納するクラス
/*
package com.example.demo.entity;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="leavingwork")//table名の指定（クラス名＝テーブル名）
public class LeavingworkEntity{

  
    @Id //primary key(user_id)
    @GeneratedValue(strategy = GenerationType.IDENTITY)//(AUTO指定にすると自動で値を割振る）
    
 @Column(name = "user_id")
    private Integer userid;

 @Column(name = "status")
    private String status;

 @Column(name = "start_date")
   private Date startdate;

 @Column(name = "start_time")
 private Time starttime;
 
 @Column(name = "end_date")
    private Date enddate;
 
 @Column(name = "end_time")
    private Time endtime;
 
 @Column(name = "break_time")
    private Time breaktime;
 
 @Column(name = "remarks")
    private String remarks;

 public static List<LeavingworkEntity> findAll() {
  // TODO 自動生成されたメソッド・スタブ
  return null;


  
 }

 public void save(LeavingworkEntity leavingworkEntity) {
  // TODO 自動生成されたメソッド・スタブ
  
 
 
 //@Column(name = "attendance_id")
   // private Integer attendanceid;
 }
}
*/