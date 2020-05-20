package com.javalec.ex.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class contentController {

	@GetMapping("contentView")
	public String controll() {

		return "contentView";

	}

	@RequestMapping("main")
	public String main() {

		return "main";

	}

	@RequestMapping("/view")
	public String view(Model model) {

		model.addAttribute("id", "naver_admin");
		model.addAttribute("pw", 1234);

		return "event/view";
	}

	@RequestMapping("stu")
	public String view1(Model model) {

		model.addAttribute("stu_num", 1001);
		model.addAttribute("name", "라팡");
		model.addAttribute("subject", "컴공");
		model.addAttribute("address", "지구");
		model.addAttribute("tel", 5522812);

		return "studentView";
	}

	@RequestMapping("model")
	public ModelAndView modelView() {

		ModelAndView mv = new ModelAndView();
		mv.addObject("id", "naver_admin");
		mv.addObject("pw", 1234);
		mv.setViewName("event/modelView");

		return mv;
	}

}
