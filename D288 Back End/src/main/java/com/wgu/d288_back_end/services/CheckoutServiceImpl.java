package com.wgu.d288_back_end.services;

import com.wgu.d288_back_end.dao.CustomerRepository;
import com.wgu.d288_back_end.entities.Cart;
import com.wgu.d288_back_end.entities.CartItem;
import com.wgu.d288_back_end.entities.Customer;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;
import java.util.UUID;

/**
 * Project: D288 Back End
 * Package: com.wgu.d288_back_end.services
 * <p>
 * User: carolyn.sher
 * Date: 7/28/2022
 * Time: 8:40 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Service
public class CheckoutServiceImpl implements CheckoutService{

    private CustomerRepository customerRepository;

    public CheckoutServiceImpl(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {
        Cart cart = purchase.getCart();
        String orderTrackingNumber=generateOrderTrackingNumber();
        cart.setOrderTrackingNumber(orderTrackingNumber);

        Set<CartItem> cartItems=purchase.getCartItems();
        cartItems.forEach(item->cart.getCartItems().add(item));

        System.out.println(cart);

        Customer customer=purchase.getCustomer();
        customer.getCarts().add(cart);

        customerRepository.save(customer);
        return new PurchaseResponse(orderTrackingNumber);

    }

    private String generateOrderTrackingNumber() {
        return UUID.randomUUID().toString();

    }
}
