package com.wgu.d288_back_end.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
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
 * Time: 9:31 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="excursions")
@Data
public class Excursion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Excursion_ID")
    private Long id;

    @Column(name="Excursion_Title")
    private String excursion_title;

    @Column(name="Excursion_Price")
    private BigDecimal excursion_price;

    @Column(name="Image_URL")
    private String image_URL;

    @Column(name="Create_Date")
    @CreationTimestamp
    private Date create_date;

    @Column(name="Last_Update")
    @UpdateTimestamp
    private Date last_update;

    @ManyToOne
    @JoinColumn(name="Vacation_ID", nullable = false)
    private Vacation vacation;

    @ManyToMany
    @JoinTable(name="excursion_cartitem", joinColumns=@JoinColumn(name="Cart_Item_ID"),
            inverseJoinColumns=@JoinColumn(name="Excursion_ID"))
    Set<CartItem> cartItems = new HashSet<>();

}
