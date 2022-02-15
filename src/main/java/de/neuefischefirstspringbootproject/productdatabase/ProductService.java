package de.neuefischefirstspringbootproject.productdatabase;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void createProduct(@RequestBody Product product) {
        products.add(product);
    }

    public Product getProduct(String id) {
        for (Product p : products) {
            if (id.equals(p.getId())) {
                return p;
            }
        }
        return null;
    }

    public Product getProductByName(String name) {
        for (Product p : products) {
            if (name.equals(p.getName())) {
                return p;
            }
        }
        return null;
    }
}

