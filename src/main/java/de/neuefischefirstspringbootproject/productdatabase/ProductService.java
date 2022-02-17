package de.neuefischefirstspringbootproject.productdatabase;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

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
        Optional<Product> result = products.stream()
                .filter(p-> id.equals(p.getId()))
                .findFirst();
        return result.orElseThrow(()->new IllegalArgumentException("ID nicht gefunden"));

        /*for (Product p : products) {
            if (id.equals(p.getId())) {
                return p;
            }
        }*/
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

