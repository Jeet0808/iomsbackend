package com.ioms.iomsbackend.Controller;

import com.ioms.iomsbackend.Model.Product;
import com.ioms.iomsbackend.Model.ResponseDTO;
import com.ioms.iomsbackend.Service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductServiceImpl productService;


    /**
     * Retrieves all products for a user by his/her userid (Long).
     *
     * @param userid The ID of the user to retrieve all products.
     * @return The List of Products object if found; otherwise, returns null.
     * @code 400 if not found  is no product found for a given userid.
     * @code 500 if exception error
     * @since 1.0
     */

    @GetMapping("/all")
    public ResponseDTO<List<Product>> getAllProducts(@RequestParam Long userid) throws MissingServletRequestParameterException {
        if (userid == null) {
            throw new MissingServletRequestParameterException("userid", "Long");
        }
        List<Product> products = productService.getAllProducts(userid);
       try{
                if (products.isEmpty()) {
                    return new ResponseDTO<>(false,null,400," No products found for id" + userid+  " In database ");
                 }
                    else{
                      return new ResponseDTO<>(true,products,null,null);
                      }
    }
       catch (UnknownError e){

        return new ResponseDTO<>(false,null,500," Internal server error; returned for unexpected server errors. ");

    }
    }


    /**
     * Add a product and assign the foreign key to userid and supplier id for integrity relationship.
     *
     * @RequestBody product takes a whole product object from user as body.
     * @return The Product object if fulfill the conditions; otherwise, returns null.
     * @code 400 if user didn't provide primary details of the product : name, price, quantityInStock,status.
     * @code 500 if exception error
     * @since 1.0
     */
    @PostMapping("/add")
    public ResponseDTO<Product> addproduct(@RequestBody Product product){
        try{
            Product product1 = productService.addProduct(product);
            if (product1==null){
                return new ResponseDTO<>(false,null,400,"product primary details should not be null: name,price,quantityInStock,status.check this fields");
            }else {
                return new ResponseDTO<>(true,product1,null,null);
            }
        }
        catch (Exception e){
            return new ResponseDTO<>(false,null,500," error exception");
        }
    }


}



