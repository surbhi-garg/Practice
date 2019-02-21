package com.ttn.barista;

import java.util.List;

public class Order {
    int tokenId;
    List<Product> productList;

    public Order(int tokenId, List<Product> productList) {
        this.tokenId = tokenId;
        this.productList = productList;
    }

    public int getTokenId() {
        return tokenId;
    }

    public void setTokenId(int tokenId) {
        this.tokenId = tokenId;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
