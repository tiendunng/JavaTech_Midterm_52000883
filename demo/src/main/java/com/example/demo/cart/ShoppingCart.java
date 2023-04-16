//package com.example.demo.cart;
//
//import jakarta.persistence.*;
//
//import java.math.BigDecimal;
//import java.util.Collection;
//import java.util.Date;
//
//
//@Entity
//@Table(name = "shopping_cart")
//public class ShoppingCart {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO )
//    private BigDecimal id;
//
//    @Temporal(TemporalType.DATE )
//    private Date date;
//
//    @Transient
//    private Long totalPrice;
//
//    @Transient
//    private int itemsNumber ;
//
//    @OneToMany(cascade = CascadeType.ALL )
//    private Collection<Cart_item> items ;
//
//    private String tokenSession ;
//
//    public BigDecimal getId() {
//        return id;
//    }
//
//    public void setId(BigDecimal id) {
//        this.id = id;
//    }
//
//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    public Long getTotalPrice() {
//        long sum =  0l; ;
//        for (Cart_item item : this.items) {
//            sum = sum +item.getProduct().getPrice();
//        }
//        this.totalPrice = totalPrice;
//        return sum;
//
//    }
//
//    public void setTotalPrice(Long totalPrice) {
//        this.totalPrice = totalPrice;
//    }
//
//    public int getItemsNumber() {
//        return this.items.size();
//    }
//
//    public void setItemsNumber(int itemsNumber) {
//        this.itemsNumber = itemsNumber;
//    }
//
//    public Collection<Cart_item> getItems() {
//        return items;
//    }
//
//    public void setItems(Collection<Cart_item> items) {
//        this.items = items;
//    }
//
//    public String getTokenSession() {
//        return tokenSession;
//    }
//
//    public void setTokenSession(String tokenSession) {
//        this.tokenSession = tokenSession;
//    }
//}
