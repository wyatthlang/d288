package com.wgu.d288_back_end.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Project: D288 Back End
 * Package: com.wgu.d288_back_end.entities
 * <p>
 * User: carolyn.sher
 * Date: 7/23/2022
 * Time: 9:30 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="carts")
@Getter
@Setter
@ToString
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Cart_ID")
    private Long id;

    @Column(name="Order_Tracking_Number")
    private String orderTrackingNumber;

    @Column(name="Package_Price")
    private BigDecimal package_price;

    @Column(name="Party_Size")
    private int party_size;

    /*@Column(name="status")
    private StatusType status;*/

    @ManyToOne
    @JoinColumn(name="customer_ID", nullable = false)
    private Customer customer;

    @OneToMany(cascade=CascadeType.ALL, mappedBy = "cart")
    private Set<CartItem> cartItems = new HashSet<>();

    @Column(name="Create_Date")
    @CreationTimestamp
    private Date create_date;

    @Column(name="Last_Update")
    @UpdateTimestamp
    private Date last_update;
}
