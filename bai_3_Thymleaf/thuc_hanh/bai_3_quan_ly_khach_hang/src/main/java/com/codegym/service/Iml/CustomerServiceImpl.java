package com.codegym.service.Iml;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Phuoc", "Phuoc@gmail.com", "Quang Binh"));
        customers.put(2, new Customer(2, "Tin", "Tin@gmail.com", "Quang Ngai"));
        customers.put(3, new Customer(3, "Luyen", "Luyen@gmail.com", "Quang Nam"));
        customers.put(4, new Customer(4, "Hiep", "Hiep@gmail.com", "Da  Nang"));
        customers.put(5, new Customer(5, "Long", "Long@gmail.com", "Quang Tri"));
        customers.put(6, new Customer(6, "Khoa", "Khoa@gmail.com", "Sai Gon"));

    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);

    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);

    }

    @Override
    public void remove(int id) {
        customers.remove(id);

    }
}
