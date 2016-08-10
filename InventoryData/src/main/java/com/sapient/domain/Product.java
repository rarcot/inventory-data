package com.sapient.domain;

import java.io.Serializable;

/**
 * Created by rarcot on 8/8/2016.
 */
public class Product implements Serializable {


    private static final long serialVersionUID = 8592603482034579247L;

    private String productId;

    private String productShortName;

    private String productLongName;

    private String productDescription;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductShortName() {
        return productShortName;
    }

    public void setProductShortName(String productShortName) {
        this.productShortName = productShortName;
    }

    public String getProductLongName() {
        return productLongName;
    }

    public void setProductLongName(String productLongName) {
        this.productLongName = productLongName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productShortName='" + productShortName + '\'' +
                ", productLongName='" + productLongName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                '}';
    }
}
