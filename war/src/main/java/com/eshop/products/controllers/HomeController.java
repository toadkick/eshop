package com.eshop.products.controllers;


import com.eshop.products.entities.Product;
import com.eshop.products.services.ProductsService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class HomeController {

    private static final Logger LOGGER = Logger.getLogger(HomeController.class);
    @Autowired
    private ProductsService productsService;

    @RequestMapping("/home")
    public ModelAndView showAllProducts() {
        List<Product> productList = productsService.showTopProducts();
        return new ModelAndView("home", "list", productList);
    }
}
