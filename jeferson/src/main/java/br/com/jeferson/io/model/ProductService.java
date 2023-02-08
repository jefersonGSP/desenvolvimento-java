
package br.com.jeferson.io.model;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepo;
    
    public List<Product> listAllProducts() {
        return productRepo.findAll();
    }
    
    public Product listOneProduct(Long codProduto) {
        return productRepo.findById(codProduto).get();
        //return productRepo.getById(codProduto);
    }

    public void addProduct(Product prod) {
        productRepo.save(prod);
    }

   public void deleteProduct(Long cod) {
      productRepo.deleteById(cod);
   }
}
