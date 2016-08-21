package dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import dao.CustomreDao;
import vo.Customer;
import vo.Result;


public class CustomerDaoImpl implements CustomreDao{
	private SqlSessionTemplate sqlSession;
	public List<Customer> list(String first_name) {
		return sqlSession.selectList("vo.customer.mapper.login",first_name);
	}
	public void setSqlSession(SqlSessionTemplate sqlSession){
		this.sqlSession=sqlSession;
	}
	public List<Customer> list() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("vo.customer.mapper.list");
	}
	
}
