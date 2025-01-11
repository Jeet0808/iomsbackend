package com.ioms.iomsbackend.Service;

import com.ioms.iomsbackend.Model.Product;
import com.ioms.iomsbackend.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    //connecting to repo class via autowired
    @Autowired
    ProductRepo productRepo;


    @Override
    public List<Product> getAllProducts(Long userid) {
        List<Product> productList = new ArrayList<>();
        for(Product products : productRepo.findAll()){
            if (products.getProductOwnerId()==userid){
                productList.add(products);
            }
        }
         return productList.isEmpty()? Collections.emptyList():productList;
    }

    @Override
    public Product getProductByProductId(Long productId) {
        return null;
    }

    @Override
    public Product addProduct(Product product) {

        if (product.getName()==null||product.getPrice()==null||product.getQuantityInStock()==null||product.getStatus()==null){
            return null;
        }else{
            return  productRepo.save(product);
        }
    }


}
