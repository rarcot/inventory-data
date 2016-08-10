package com.sapient.dao.category;

import com.sapient.domain.Product;

/**
 * Created by rarcot on 8/10/2016.
 */
public interface ProductDAO {

    public Product getProductById(String productId) throws Exception;
}
