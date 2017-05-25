package org.smart4j.chapter3.service;

import org.smart4j.chapter3.model.Customer;
import org.smart4j.framework.helper.DatabaseHelper;

import java.util.List;
import java.util.Map;

/**
 * Created by guanxiaoda on 17/5/25.
 */
public class CustomerService {


    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    public Customer getCustomer(long id) {
        String sql = "SELECT * FROM customer WHERE id = ?";
        return DatabaseHelper.queryEntity(Customer.class, sql, id);
    }

    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
