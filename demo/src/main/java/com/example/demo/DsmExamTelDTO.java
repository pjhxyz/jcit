package com.example.demo;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor // 자동으로 모든 매개변수를 받는 생성자를 생성
@Getter // Getter 생성
@Setter // Setter 생성
//@RequiredArgsConstructor
public class DsmExamTelDTO {
	
	private BigDecimal logDate;
    private String userName;
    private BigDecimal logCount;

//    public DsmExamTelDTO(int logDate, String userName, int logCount) {
//    	this.logDate = logDate;
//    	this.userName = userName;
//    	this.logCount = logCount;
//    }
//	
	
}
