/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Product;
import java.util.List;

/**
 *
 * @author jcrbsa
 */
public interface RepositorioProduct {
    boolean insertProduct(Product customer);
	boolean updateProduct(int id, Product customer);
	boolean deleteProduct(int id);
    Product selectProduct(int id);
    List<Product> listProducts();
}
