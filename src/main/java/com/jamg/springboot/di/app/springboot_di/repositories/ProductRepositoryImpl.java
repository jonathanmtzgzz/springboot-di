package com.jamg.springboot.di.app.springboot_di.repositories;

import com.jamg.springboot.di.app.springboot_di.models.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepositoryImpl implements ProductRepository {

    private List<Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
                new Product(1L, "Memoria corsair 32", 300L),
                new Product(2L, "Cpu intel core i9", 850L),
                new Product(3L, "Teclado razer mini 60%", 180L),
                new Product(4L, "Motherboard gigabyte", 250L)
        );
    }

    @Override
    public List<Product> findAll() {
        return data;
    }

    @Override
    public Product findById(Long id) {
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

}
