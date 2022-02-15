package de.neuefischefirstspringbootproject.productdatabase;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/products")

public class ShopController {
    private final ProductService productService;

    public ShopController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable String id) {
        return productService.getProduct(id);
    }

    @PostMapping
    public void createProduct(@RequestBody Product product) {
        productService.createProduct(product);
    }

    @GetMapping("/search")
    public Product search(@RequestParam String searchValue) {
        return productService.getProductByName(searchValue);
    }

}

