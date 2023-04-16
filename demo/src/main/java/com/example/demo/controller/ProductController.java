package com.example.demo.controller;

import com.example.demo.dto.ProductDto;
import com.example.demo.module.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@Service
public class ProductController {

    @Autowired
    private ProductService productService;

    public ProductController (ProductService productService) {
        this.productService = productService;
    }


//    @RequestMapping(value = "/index", method = RequestMethod.GET)
//    public String viewHomePage(Model model) {
//        List<ProductDto> listProducts = service.findAllProduct();
//        System.out.println(listProducts);
//        model.addAttribute("listProducts", listProducts);
//
//        return "index";
//    }



    @RequestMapping(value = "/product", method = RequestMethod.GET)
        public String showAddProductForm(Model model) {
            ProductDto product = new ProductDto();

            model.addAttribute("product",  product);
            return "product/product_add";
        }

    @RequestMapping(value = "/product/save", method = RequestMethod.POST)
        public String addProduct(@ModelAttribute("product") ProductDto productDTO,
                                 BindingResult result,
                                 Model model) {
            Product product = new Product();
//            product.setName(productDTO.getName());
//            product.setPrice(productDTO.getPrice());
        if (result.hasErrors()) {
            model.addAttribute("product", productDTO);
            return "product/product_add";
        }


        productService.saveProduct(productDTO);
            return "redirect:/product?success";
        }

    @RequestMapping(value = "/product/display_product", method = RequestMethod.GET)
        public String listProducts(Model model) {
            List<ProductDto> products = productService.findAllProduct();
            model.addAttribute("products", products);
            return "product/display_product";
        }

    @RequestMapping(value = "/manage", method = RequestMethod.GET)
        public String showManageProductForm(Model model) {
            return "manage/manage_form";
        }
}


