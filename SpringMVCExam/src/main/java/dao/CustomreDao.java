package dao;

import java.util.List;

import vo.Customer;
import vo.Result;

public interface CustomreDao {
	public List<Customer> list(String first_name);
	public List<Customer> list();
}
