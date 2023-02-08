
package br.com.jeferson.io.controller;


import br.com.jeferson.io.model.ProductService;
import br.com.jeferson.io.model.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
    
    @Autowired
    private ProductService productServ;
    
    @RequestMapping("/")
    public String viewIndex(Model model) {
        List<Product> listProducts = productServ.listAllProducts();
        model.addAttribute("listProducts", listProducts);
        System.out.println(">>> index <<<");
        return "index";
    }
    
    @RequestMapping("/add_product")
    public String addProduct(Model model) {
        Product prod = new Product();
        model.addAttribute("product", prod);
        System.out.println(">>> Adicionando produto <<<");
        return "add_product";
    }
    
    @RequestMapping(value="/add_product", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product")Product prod) {
        productServ.addProduct(prod);
        System.out.println("> Produto salvo: "+prod.getName_product());
        return "redirect:/";
    }
    
    @RequestMapping("/edit_product/{cod_product}")
    public ModelAndView editProduct(@PathVariable(name="cod_product") Long cod_product) {
        ModelAndView mav = new ModelAndView("edit_product");
        Product prod = productServ.listOneProduct(cod_product);
        mav.addObject("product", prod);
        
        System.out.println("> Produto editado: "+prod.getName_product());
        return mav;
    }

   @RequestMapping("/delete_product/{cod_product}")
      public String deleteProduct(@PathVariable(name="cod_product")Long cod_product) {
        productServ.deleteProduct(cod_product);
        System.out.println("> Produto "+cod_product+" removido com sucesso.");
        return "redirect:/";
      }
}
