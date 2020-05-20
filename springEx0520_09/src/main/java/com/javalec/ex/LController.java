package com.javalec.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LController {

	@RequestMapping("form")
	public String form() {

		return "form";
	}

	@RequestMapping("loginOk")
	public String loginOk() {

		return "loginOk";
	}

	@RequestMapping("loginFail")
	public String loginFail() {

		return "loginFail";
	}

	@RequestMapping("checkOk")
	public String checkOk(HttpServletRequest request, Model model) {

		String id = request.getParameter("id");

		if (id.equals("naver_admin")) {
			model.addAttribute("id", id);
			model.addAttribute("pw", request.getParameter("pw"));
			return "redirect:loginOk";
		}

		return "redirect:loginFail";
	}

}
