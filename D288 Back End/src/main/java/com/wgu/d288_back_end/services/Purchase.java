package com.wgu.d288_back_end.services;

import com.wgu.d288_back_end.entities.Cart;
import com.wgu.d288_back_end.entities.CartItem;
import com.wgu.d288_back_end.entities.Customer;
import lombok.Data;

import java.util.Set;

/**
 * Project: D288 Back End
 * Package: com.wgu.d288_back_end.services
 * <p>
 * User: carolyn.sher
 * Date: 7/28/2022
 * Time: 8:27 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Data
public class Purchase {
    private Customer customer;
    private Cart cart;
    private Set<CartItem> cartItems;

}
