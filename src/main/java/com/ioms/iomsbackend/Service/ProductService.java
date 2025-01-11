package com.ioms.iomsbackend.Service;

import com.ioms.iomsbackend.Model.Product;

import java.util.List;
import java.util.UUID;

/**
 * This ProductService class handles all operation related to Products
 * Including retrieving, updating, adding and deleting products in the
 * Inventory system
 *
 * <p>This class interacts with the ProductRepository class interface to
 * Handle the database interaction and applying
 * Business Logic before returning the results
 * To the calling service or controller</p>
 *
 *
 * <p><b>Example Usage in different class:</b></p>
 *
 * <pre>
 *     ProductService productService = new ProductService(productRepository);
 *     Product product = productService.getProductById(1L);
 * </pre>
 *              or
 * <pre>
 *   @Autowiered
 * <pre>
 *
 * ProductService productService;
 *
 *  Product product = productService.getProductById(1L);
 *
 * </pre>
 * </pre>
 *
 * @author [jeet]
 * @version 1.0
 * @since 2025-01-06
 *
 */

public interface ProductService {

    // All Product retrieving methode to return all products
     List<Product> getAllProducts(Long userid);
     // IndividualProduct by product id sent from client retrieving methode
    Product getProductByProductId(Long productId);
    //Add Product methode
    Product addProduct(Product product);






}
