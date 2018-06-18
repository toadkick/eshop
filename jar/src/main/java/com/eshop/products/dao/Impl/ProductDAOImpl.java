package com.eshop.products.dao.Impl;

import com.eshop.products.dao.ProductDAO;
import com.eshop.products.entities.Product;
import com.eshop.products.entities.ProductRowMap;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Component
public class ProductDAOImpl implements ProductDAO {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<Product> getAllProducts() {
       /* List<Product> lp = new ArrayList<Product>();
        lp.add(new Product(1,2,"JavaBook","Blockh",2,200,5,2015));
        lp.add(new Product(2,2,"JavaBook2","Blockh",2,400,5,2014));
        lp.add(new Product(3,2,"JavaBook3","Blockh",2,500,3,2012));
        return lp;*/
        return template.query("select * from products", new ProductRowMap());
    }

    public List<Product> getAllCategories() {
        return null;
    }

    @Override
    public List<Product> getProductsByName(String productName) {
        return template.query("select * from products where name is LIKE \"%" + productName + "%\"", new ProductRowMap());
    }

    @Override
    public List<Product> getProductsByCategory(int catID) {
        return template.query("select * from products where CATEGORY_ID=" + catID, new ProductRowMap());
    }

}
