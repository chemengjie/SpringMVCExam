package service;

import java.util.List;

import vo.Customer;

public interface CustomerService {
	public List<Customer> list(String first_name);
	public List<Customer> list();
}
