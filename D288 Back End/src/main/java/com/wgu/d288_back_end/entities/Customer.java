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
 * Time: 9:29 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="customers")
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Customer_ID")
    private Long id;

    @Column(name="Customer_First_Name")
    private String firstName;

    @Column(name="Customer_Last_Name")
    private String lastName;

    @Column(name="Address")
    private String address;

    @Column(name="Postal_Code")
    private String postal_code;

    @Column(name="Phone")
    private String phone;

    @Column(name="Create_Date")
    @CreationTimestamp
    private Date create_date;

    @Column(name="Last_Update")
    @UpdateTimestamp
    private Date last_update;

    @ManyToOne
    @JoinColumn(name="Division_ID"/*, nullable = false*/)
    private Division division;

    @OneToMany(cascade=CascadeType.ALL, mappedBy = "customer")
    private Set<Cart> carts= new HashSet<>();

}
