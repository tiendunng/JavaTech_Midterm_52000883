//package com.example.demo.cart;
//
//import com.example.demo.module.Product;
//import jakarta.persistence.*;
//
//import java.math.BigDecimal;
//import java.util.Date;
//
//
//@Entity
//@Table(name = "cartItem")
//public class Cart_item {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO )
//    private BigDecimal id;
//    private int quantity;
//
//    @Temporal(TemporalType.DATE)
//    private Date date ;
//    @ManyToOne(fetch = FetchType. EAGER,  cascade=CascadeType.ALL)
//    @JoinColumn(name = "product_id")
//    private Product product;
//
//    public BigDecimal getId() {
//        return id;
//    }
//
//    public void setId(BigDecimal id) {
//        this.id = id;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
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
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime* result + ((id == null)? 0  : id.hashCode());
//        return result;
//    }
//
//    @Override
//    public boolean equals (Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        Cart_item other= (Cart_item) obj;
//        if (id == null) {
//            if (other.id != null)
//                return false;
//        } else if (!id.equals(other.id))
//            return false;
//        return true;
//    }
//
//}
