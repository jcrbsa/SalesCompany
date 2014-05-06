/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Product;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jcrbsa
 */
public class RepositorioProductList implements RepositorioProduct {

    private static int id = 0;
    private static List<Product> products = new ArrayList<Product>();

    @Override
    public boolean insertProduct(Product customer) {

        try {
            products.add(customer);
            id++;
            return true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return false;

    }

    @Override
    public boolean updateProduct(int id, Product customer) {

        try {
            products.set(id, customer);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteProduct(int id) {
        try {
            products.remove(id);
            id--;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public Product selectProduct(int id) {
        try {

            return products.get(id);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }

    @Override
    public List<Product> listProducts() {

        return products;
    }
}
