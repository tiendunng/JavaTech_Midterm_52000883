//package com.example.demo.controller;
//
//
//import com.example.demo.service.ProductService;
//import com.example.demo.service.ShoppingCartService;
//import jakarta.servlet.http.HttpSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.math.BigDecimal;
//import java.util.UUID;
//
//@Controller
//public class CartController {
//
//
//    @Autowired
//    private ProductService productService ;
//
//    @Autowired
//    private ShoppingCartService shoppingCartService ;
//
//    @RequestMapping(value = "/addToCart" , method = RequestMethod.GET)
//    public String addoCart(HttpSession session , Model model, @RequestParam("id") BigDecimal id, @RequestParam("quantity") int quantity) {
//// sessiontToken
//        String sessionToken = (String) session.getAttribute("sessionToken") ;
//        if(sessionToken == null){
//            sessionToken = UUID.randomUUID().toString();
//            session.setAttribute("sessionToken", sessionToken);
//            shoppingCartService.addShoppingCartFirstTime(id,sessionToken,quantity);
////            ShoppingCart shoppingCart = new ShoppingCart();
////            Cart_item cart_item = new Cart_item();
////            cart_item.setQuantity(quantity);
////            cart_item.setDate(new Date());
////            cart_item.setProduct (productService.findByid(id));
////            shoppingCart.getItems().add(cart_item);
//        }else {
//            shoppingCartService.addShoppingCart(id,sessionToken,quantity);
//        }
//
//        return "redirect:/index";
//    }
//}
