/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version ${license.version})
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2013
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package fr.hoteia.qalingo.core.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.hoteia.qalingo.core.common.dao.CustomerDao;
import fr.hoteia.qalingo.core.common.domain.Customer;
import fr.hoteia.qalingo.core.common.service.CustomerService;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	public Customer getCustomerById(final String rawCustomerId) {
		long customerId = -1;
		try {
			customerId = Long.parseLong(rawCustomerId);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(e);
		}
		return customerDao.getCustomerById(customerId);
	}
	
	public Customer getCustomerByLoginOrEmail(final String usernameOrEmail) {
		return customerDao.getCustomerByLoginOrEmail(usernameOrEmail);
	}

	public List<Customer> findCustomer(final Customer criteria) {
		return customerDao.findByExample(criteria);
	}

	public void saveOrUpdateCustomer(final Customer customer) {
		customerDao.saveOrUpdateCustomer(customer);
	}

	public void deleteCustomer(final Customer customer) {
		customerDao.deleteCustomer(customer);
	}

}