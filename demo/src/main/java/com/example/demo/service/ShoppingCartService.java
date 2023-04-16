//package com.example.demo.service;
//
//import com.example.demo.cart.Cart_item;
//import com.example.demo.cart.ShoppingCart;
//import com.example.demo.module.Product;
//import com.example.demo.repository.ShoppingCartRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.math.BigDecimal;
//import java.util.Date;
//
//@Service
//public class ShoppingCartService {
//    @Autowired
//    private ShoppingCartRepository shoppingCartRepository;
//    @Autowired
//    private ProductService productService;
//
//
//    public ShoppingCart addShoppingCartFirstTime(BigDecimal id, String sessionToken, int quantity) {
//
//        ShoppingCart shoppingCart = new ShoppingCart();
//        Cart_item cartItem = new Cart_item() ;
//        cartItem.setQuantity (quantity);
//        cartItem.setDate(new Date());
//        cartItem.setProduct (productService.findByid(id));
//        shoppingCart.getItems ().add(cartItem);
//        shoppingCart.setTokenSession(sessionToken);
//        return shoppingCartRepository.save(shoppingCart);
//    }
//
//    public ShoppingCart addShoppingCart(BigDecimal id, String sessionToken, int quantity) {
//        ShoppingCart shoppingCart = shoppingCartRepository.findByTokenSession(sessionToken);
//        Product p = productService.findByid(id);
//        for(Cart_item item:shoppingCart.getItems()){
//            if(p.getId().equals(item.getProduct().getId())){
//                item.setQuantity(item.getQuantity()+quantity);
//                return shoppingCartRepository.save(shoppingCart);
//            }
//        }
//
//        Cart_item cartItem = new Cart_item() ;
//        cartItem.setQuantity (quantity);
//        cartItem.setDate(new Date());
//        cartItem.setProduct (p);
//        shoppingCart.getItems ().add(cartItem);
//        return shoppingCartRepository.save(shoppingCart);
//    }
//}
