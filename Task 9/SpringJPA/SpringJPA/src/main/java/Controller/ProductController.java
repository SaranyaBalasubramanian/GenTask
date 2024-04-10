
package Controller;

import Domain.Product;
import Service.ProductService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/addProduct")
    public String showAddProductForm() {
        return "addProduct";
    }

    @PostMapping("/addProduct")
    public String addProduct(@ModelAttribute Product product) {
        productService.saveProduct(product);
        return "redirect:/";
    }

    @GetMapping("/displayProduct")
    public String showDisplayProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "displayProduct";
    }

    @PostMapping("/displayProduct")
    public String displayProduct(@RequestParam("category") String category, Model model) {
        List<Product> products = productService.getAllProductsByCategory(category);
        model.addAttribute("products", products);
        return "productList";
    }
}