/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Customer;
import java.util.List;

/**
 *
 * @author jcrbsa
 */
public interface RepositorioCustomer {
    boolean insertCustomer(Customer customer);
	boolean updateCustomer(int id, Customer customer);
	boolean deleteCustomer(int id);
    Customer selectCustomer(int id);
    List<Customer> listCustomers();
}
