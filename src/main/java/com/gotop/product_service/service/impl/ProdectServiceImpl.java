package com.gotop.product_service.service.impl;

import com.gotop.product_service.domain.Product;
import com.gotop.product_service.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProdectServiceImpl implements ProductService {
    private static final Map<Integer, Product> daoMap = new HashMap<>();

    static {

        Product p1 = new Product(1, "iphonex", 9999, 10);
        Product p2 = new Product(2, "java编程思想", 388, 56);
        Product p3 = new Product(3, "电脑", 55, 34);
        Product p4 = new Product(4, "电风吹", 234, 2);
        Product p5 = new Product(5, "洗衣机", 432, 3);
        Product p6 = new Product(6, "电冰箱", 435, 54);
        Product p7 = new Product(7, "电视", 435, 34);

        daoMap.put(p1.getId(), p1);
        daoMap.put(p2.getId(), p2);
        daoMap.put(p3.getId(), p3);
        daoMap.put(p4.getId(), p4);
        daoMap.put(p5.getId(), p5);
        daoMap.put(p6.getId(), p6);
        daoMap.put(p7.getId(), p7);
    }

    @Override
    public List<Product> listProduct() {
        Collection<Product> collection = daoMap.values();
        List<Product> list = new ArrayList<>(collection);
        return list;
    }

    @Override
    public Product findById(int id) {
        return daoMap.get(id);
    }
}
