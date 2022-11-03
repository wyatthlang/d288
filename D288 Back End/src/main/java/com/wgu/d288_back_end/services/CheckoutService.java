package com.wgu.d288_back_end.services;

/**
 * Project: D288 Back End
 * Package: com.wgu.d288_back_end.services
 * <p>
 * User: carolyn.sher
 * Date: 7/28/2022
 * Time: 8:39 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
