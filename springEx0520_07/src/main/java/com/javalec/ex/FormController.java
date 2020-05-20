package com.javalec.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@RequestMapping("form")
	public String form() {

		return "form";
	}

	@RequestMapping("form2")
	public String form2() {

		return "form2";
	}

	@RequestMapping("form3")
	public String form3() {

		return "form3";
	}

	@RequestMapping("form1")
	public String form1(@RequestParam("f_num") int f_num, @RequestParam("f_name") String f_name,
			@RequestParam("f_content") String f_content, @RequestParam("f_date") int f_date,
			@RequestParam("f_group") int f_group, @RequestParam("f_step") int f_step,
			@RequestParam("f_indent") int f_indent, Model model) {

		model.addAttribute("f_num", f_num);
		model.addAttribute("f_name", f_name);
		model.addAttribute("f_content", f_content);
		model.addAttribute("f_date", f_date);
		model.addAttribute("f_group", f_group);
		model.addAttribute("f_step", f_step);
		model.addAttribute("f_indent", f_indent);

		return "formOk1";
	}

	@RequestMapping("form2Ok")
	public String form2(HttpServletRequest request, Model model) {

		int f_num = Integer.parseInt(request.getParameter("f_num"));
		String f_name = request.getParameter("f_name");
		String f_content = request.getParameter("f_content");
		String f_date = request.getParameter("f_date");
		String f_group = request.getParameter("f_group");
		String f_step = request.getParameter("f_step");
		String f_indent = request.getParameter("f_indent");

		model.addAttribute("f_num", f_num);
		model.addAttribute("f_name", f_name);
		model.addAttribute("f_content", f_content);
		model.addAttribute("f_date", f_date);
		model.addAttribute("f_group", f_group);
		model.addAttribute("f_step", f_step);
		model.addAttribute("f_indent", f_indent);

		return "formOk2";
	}

	@RequestMapping("form3Ok")
	public String form3(form3 form3) {
		return "formOk3";
	}

}
