package com.gotop.product_service.controller;

import com.gotop.product_service.domain.Product;
import com.gotop.product_service.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Value("${server.port}")
    private String port;

    /**
     * 获取所有商品列表
     *
     * @return
     */
    @RequestMapping("list")
    public Object list() {
        return productService.listProduct();
    }

    /**
     * 根据id查找商品详情
     *
     * @param id
     * @return
     */
    @RequestMapping("find")
    public Object find(@RequestParam("id") int id) {
        Product product = productService.findById(id);
        Product result = new Product();
        BeanUtils.copyProperties(product, result);
        result.setName(product.getName() + "data from port =" + port);
        return result;
    }
}
