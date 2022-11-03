package com.wgu.d288_back_end.controllers;

import com.wgu.d288_back_end.services.CheckoutService;
import com.wgu.d288_back_end.services.Purchase;
import com.wgu.d288_back_end.services.PurchaseResponse;
import org.springframework.web.bind.annotation.*;

/**
 * Project: D288 Back End
 * Package: com.wgu.d288_back_end.controllers
 * <p>
 * User: carolyn.sher
 * Date: 7/28/2022
 * Time: 9:03 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase){
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
        return purchaseResponse;
    }
}
