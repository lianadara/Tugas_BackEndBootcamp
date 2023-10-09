package com.multipolar.bootcamp.product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// menandakan products ini adlh rest controller atau api
@RestController
@RequestMapping("/api")
public class ProductController {
    //http://localhost:8080/api/products
    @GetMapping("/products")
    public ResponseEntity<List<products>> products(){
        List<products> todoList = List.of(
                new products(1,"Book"),
                new products(2,"Laptop"),
                new products(3,"Computer"),
                new products(4,"Handphone"),
                new products(5,"Bag"));

        return ResponseEntity.ok(todoList);
    }
}
