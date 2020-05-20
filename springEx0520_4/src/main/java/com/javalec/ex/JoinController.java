package com.javalec.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JoinController {

	@RequestMapping("join")
	public String join() {

		return "join";
	}

	@RequestMapping(method = RequestMethod.POST, value = "joinOk")
	public String JoinOk(HttpServletRequest request, Model model) {

		String mem_num = request.getParameter("mem_num");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String tel = request.getParameter("tel");
		String birth = request.getParameter("birth");

		model.addAttribute("mem_num", 1001);
		model.addAttribute("name", "홍길동");
		model.addAttribute("address", "주소");
		model.addAttribute("tel", "010-5522-8102");
		model.addAttribute("birth", "10월23일");

		return "joinOk";
	}

	@RequestMapping(method = RequestMethod.GET, value = "joinOk")
	public ModelAndView JoinOk(HttpServletRequest request) {

		ModelAndView mv = new ModelAndView();

		mv.addObject("mem_num", 1001);
		mv.addObject("name", "홍길동");
		mv.addObject("address", "주소");
		mv.addObject("tel", "010-5522-8102");
		mv.addObject("birth", "10월23일");

		return mv;

	}

}
