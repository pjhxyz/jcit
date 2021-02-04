package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor // 자동으로 모든 매개변수를 받는 생성자를 생성
@Getter // Getter 생성
@Setter // Setter 생성
public class MyData {
	
//	private int id;
	private String name;
	private int age;
}
