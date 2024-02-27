package com.springdatajpa.comspringdatajpa.repository;

import com.springdatajpa.comspringdatajpa.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void saveMethod() {
// create product
        Product product = new Product();
        product.setName("product 1");
        product.setDescription("product 1 description");
        product.setSku("100ABC");
        product.setPrice(new BigDecimal(100));
        product.setActive(true);
        product.setImageUrl("product1.png");
// save product
        Product savedObject = productRepository.save(product);

// display product info
        System.out.println(savedObject.getId());
        System.out.println(savedObject.toString());
    }

    void updateUsingSaveMethod() {

        //find or retriev an entity by id
        Long id = 1L;
        Product product = productRepository.findById(id).get(); //id passing as optional arg
        // Update entity information
        product.setName("updated Product 1");
        product.setDescription("updated Product 1 Description ");
        // Save updated entity
        productRepository.save(product);  //sSAVE can be used to perform both the save and update
        //operations


    }
    @Test
    void findByIdMethod(){
        Long id = 1L;
        Product product = productRepository.findById(id).get();

    }
    @Test
    void saveallMethod(){
        //Creating Product
        Product product = new Product();
        product.setName("product 2");
        product.setDescription("product 2 description");
        product.setSku("100ABCDE");
        product.setPrice(new BigDecimal(200));
        product.setActive(true);
        product.setImageUrl("product2.png");

        //Creating Product
        Product produc3 = new Product();
        produc3.setName("product32");
        produc3.setDescription("product 3 description");
        produc3.setSku("100ABCD3");
        produc3.setPrice(new BigDecimal(200));
        produc3.setActive(true);
        produc3.setImageUrl("product3.png");
        productRepository.saveAll(List.of(product,produc3));



    }
    @Test
    void findAllMethod(){

        List<Product> products= productRepository.findAll();

        products.forEach((p)->{
            System.out.println(p.getName());
        });
    }

@Test
    void deleteByIdMethod(){
        Long id=1L;
        productRepository.deleteById(id);

    }
@Test
    void deleteMethod(){
        //find an entity by id
        Long id = 7L;
        //Because the findbyid() returns the object which is optional type
        Product product = productRepository.findById(id).get();
        //delete(entity) by retrieving the id first..
        productRepository.delete(product);

    }
    @Test
    void deleteAllMethod(){
        productRepository.deleteAll();
    }

    //Delete all method with parameters

    @Test
    void parDeleteall(){
        Product product =productRepository.findById(5L).get();//Getting the product entities
        Product product1 =productRepository.findById(6L).get();

        productRepository.deleteAll(List.of(product,product1));
    }
    @Test
    void countMethod(){//simply returns the number of records
        long count= productRepository.count();
        System.out.println(count);
    }
@Test
    void existsBy(){
        Long id = 7L;
        boolean result = productRepository.existsById(id);
    System.out.println("Result: "+result);
}
}