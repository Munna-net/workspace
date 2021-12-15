package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ProductService;
import com.example.demo.entity.Product;

@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product) {
		 return service.saveProduct(product);
		 
	}
	@PostMapping("/addproducts")
	public List<Product> addProducts(@RequestBody List<Product> products) {
		 return service.saveProducts(products);
			 	 
	}
@GetMapping("/findById/{id}")
public Optional<Product> findById(@PathVariable int id) {
	return service.getProductById(id);
}

@DeleteMapping("/delete/{id}")
public String  DeleteById(@PathVariable int id) {
	return  service.deleteById(id);	
}
@PutMapping("/update")
public Product update(@RequestBody Product product) {
	return service.update(product);
	
}


}
