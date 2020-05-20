package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PController {

	@RequestMapping("student/{studentId}")
//	http://localhost:8181/ex/student/ : student뒤에 들어오는 모든값을 변수로 받겠다.
	public String pathViewOk(@PathVariable String studentId, Model model) {

		model.addAttribute("studentId", studentId);

		return "student/pathViewOk";
	}

}
