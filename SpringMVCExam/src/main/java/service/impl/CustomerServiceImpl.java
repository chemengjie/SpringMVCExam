package service.impl;

import java.util.List;

import dao.CustomreDao;
import service.CustomerService;
import vo.Customer;
import vo.Result;

public class CustomerServiceImpl implements CustomerService{
	
	private CustomreDao customerDao;
	public void setCustomerDao(CustomreDao customerDao){
		this.customerDao=customerDao;
	}

	public List<Customer> list(String first_name) {
		List<Customer> list = customerDao.list(first_name);
		
		return list;
		
	}

	public List<Customer> list() {
		List<Customer> list = customerDao.list();
		return list;
	}

}
