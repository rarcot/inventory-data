package com.sapient.dao.category;

import com.sapient.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rarcot on 8/9/2016.
 */
@Repository
public class CategoryDAOImpl implements CategoryDAO{

    @Autowired
    private MongoTemplate mongoTemplate;


    public List<Category> getAllCategories() {
        List<Category> categories = mongoTemplate.findAll(Category.class,"category");
        return categories;
    }
}
