package com.example.demo;

import java.math.BigDecimal;
import java.util.List;

public interface DsmExamTelDAO {

	List<DsmExamTelDTO> selectDsmExamTels(DsmExamTelDTO param) throws Exception;

	List<DsmExamTelDTO> selectDsmExamTelById(BigDecimal id) throws Exception;
}
