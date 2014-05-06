/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Product;
import java.util.List;
import repository.RepositorioProduct;
import repository.RepositorioProductList;

/**
 *
 * @author jcrbsa
 */
public class FachadaProducts {
      private static FachadaProducts fachadaProduto;
    
    private RepositorioProduct repositorioProduto;
//    private RepositorioProductItems repositorioProductItems;
    
    
    static{
        fachadaProduto =  new FachadaProducts();
    }
    
    private FachadaProducts(){
        repositorioProduto = new RepositorioProductList();
        //repositorioProduto = new RepositorioProdutoBD();
        
    }

    public static FachadaProducts getInstance(){
        return fachadaProduto;
    }
    
    
    
     public void realizeProduct(Product product) {
    repositorioProduto.insertProduct(product);
    
}
   public void  editProduct(int id, Product product){
    
    repositorioProduto.updateProduct(id, product);
}
    
    public void  deleteProduct(int id ){
    repositorioProduto.deleteProduct(id);
    }

                    
    public List<Product>  visualizeProduto(){
       return repositorioProduto.listProducts();
    }
    
    
    
}
