package com.wgu.d288_back_end.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
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
@Table(name="cart_items")
@Getter
@Setter
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Cart_Item_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name="Vacation_ID", nullable = false)
    private Vacation vacation;

    @ManyToMany(cascade=CascadeType.ALL, mappedBy = "cartItems")
    private Set<Excursion> excursions = new HashSet<>();

    @ManyToOne
    @JoinColumn(name="cart_ID", nullable = false)
    private Cart cart;

    @Column(name="Create_Date")
    @CreationTimestamp
    private Date create_date;

    @Column(name="Last_Update")
    @UpdateTimestamp
    private Date last_update;

}
