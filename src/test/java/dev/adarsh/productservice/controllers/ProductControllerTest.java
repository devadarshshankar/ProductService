package dev.adarsh.productservice.controllers;

import dev.adarsh.productservice.models.Product;
import dev.adarsh.productservice.repositories.ProductRepository;
import dev.adarsh.productservice.services.ProductService;
import dev.adarsh.productservice.services.SelfProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@SpringBootTest
class ProductControllerTest {

    @Autowired
    private ProductController productController;
    @MockBean
    private ProductService productService;
    @Test
    void testAbsShouldGivePositiveValue(){
        int a=Math.abs(-2);
        assert (a==2);
    }

    @Test
    public void testArrayIsSortedCorrectlly(){
        int []l={1,2,3,5,4,6};
        Arrays.sort(l);
        assert l[4]==5;
        assert (l[3]==4);
    }

    @Test
    void getAllProductShouldReturnEmptyListWhenNoProduct(){
//        ProductService productService=new SelfProductService() ;
////        ProductRepository productRepository=n
//        ProductController productController=new ProductController(productService);

//        List<Product> p=new ArrayList<>();
//        Product product=new Product();
//        product.setPrice(109.95);
//        p.add(product);
//        when(productService.getAllProduct()).thenReturn(p);
//        List<Product> products=productController.getAllProduct("12").getBody();
//        assert products.get(0).getPrice()==109.95;
//
}

}