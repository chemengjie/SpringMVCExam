package controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.HttpJspPage;
import javax.servlet.jsp.PageContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import service.CustomerService;
import vo.Customer;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@RequestMapping("/login")
	public String list(String first_name, HttpSession session) {
		System.out.println(first_name);
		Customer customer;
		try {
			customer = (Customer)customerService.list(first_name).get(0);
			if (customer != null) {
				session.setAttribute("user", first_name);
				System.out.println(session.getAttribute("user"));
				return "/user.do";
			} else {
				return "/login.jsp";
			}
		} catch (Exception e) {
			return "/login.jsp";
		}
		
	}
	
	@RequestMapping("/user")
	public String list(ModelMap map) {
		map.addAttribute("list", customerService.list());
		return "/list.jsp";//表示转发
	}
	
}
