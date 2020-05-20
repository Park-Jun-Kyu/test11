package com.javalec.ex.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notice")
public class NController {

	@RequestMapping("notice")
	public String noticeView() {

		return "notice/noticeView";
	}

}
