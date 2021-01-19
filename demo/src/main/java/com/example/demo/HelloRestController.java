package com.example.demo;

import java.math.BigDecimal;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@MapperScan(basePackages="com.example.demo")//탐색할 패키지 설정
public class HelloRestController {
	
//	@Autowired
//	private DsmExamTelDTO dsmExamTelDTO;
	@Autowired
	private DsmExamTelDAO dsmExamTelDAO;
	
	String[] names = {"kim","lee","park","choi","jo"};
	String[] mails = {"kim@naver.com","lee@naver.com","park@naver.com","choi@naver.com","jo@naver.com"};

	@RequestMapping("/rest")
	public List<DsmExamTelDTO> readAll()  throws Exception {
//		return "Hello, I love jiwoojian! " + id;
//		return service.getAll();

//		final DsmExamTelDTO param = new DsmExamTelDTO(0, "KIM", null);//전달 받은 country를 받은 UserDTO 객체 생성 이 객체는 MyBatis에 파라미터로 전달
//		BigDecimal logDate = new BigDecimal(20210111);  
		final DsmExamTelDTO param = new DsmExamTelDTO(new BigDecimal(20210111), "KIM", new BigDecimal(0));//전달 받은 country를 받은 UserDTO 객체 생성 이 객체는 MyBatis에 파라미터로 전달
		List<DsmExamTelDTO> dsmExamTelDTOList = null;
//		try {
			dsmExamTelDTOList = dsmExamTelDAO.selectDsmExamTels(param);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}// 22번 째 줄에서 생성한 객체를 파라미터로 전달하여 DB로부터 사용자 목록을 불러온다. 전체목록 조회
		return dsmExamTelDTOList;
		
	}

//	@RequestMapping("/rest/{id}")
//	public DataObject index(@PathVariable int id) {
////		return "Hello, I love jiwoojian! " + id;
//		return new DataObject(id,names[id],mails[id]);
//	}

	@RequestMapping("/rest/{id}")
	public List<DsmExamTelDTO> index2(@PathVariable int id) throws Exception {
		return dsmExamTelDAO.selectDsmExamTelById(new BigDecimal(id));
	}

}
	