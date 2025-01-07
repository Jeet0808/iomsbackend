package com.ioms.iomsbackend.Service;

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

public class ProductService {
}
