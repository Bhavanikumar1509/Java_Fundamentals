package com.anno.beans;

import java.util.List;

public interface CustomerDAO {
	public int addCustomer(Customer cust);

	public int deleteCustomer(int id);

	public int updateCustomer(int id, String new_name);

	public List<Customer> displayTable();
}
