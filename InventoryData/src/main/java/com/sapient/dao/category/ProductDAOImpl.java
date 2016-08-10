package com.sapient.dao.category;

import com.sapient.domain.Product;
import com.sapient.domain.ProductCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rarcot on 8/10/2016.
 */
@Repository
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    private MongoTemplate mongoTemplate;

    public Product getProductById(String productId) throws Exception {
        Criteria queryCrit = Criteria.where("products.productId");
        List<ProductCollection> products = mongoTemplate.find(new Query(queryCrit.is(productId)),ProductCollection.class);
        if(products!=null && !products.isEmpty()){
           return products.get(0).getProducts().get(0);
        }else{
            return null;
        }
    }
}
