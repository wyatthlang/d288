package com.wgu.d288_back_end.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
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
@Table(name="vacations")
@Getter
@Setter
public class Vacation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Vacation_ID")
    private Long id;

    @Column(name="Vacation_Title")
    private String vacation_title;

    @Column(name="Description")
    private String description;

    @Column(name="Travel_Fare_Price")
    private BigDecimal travel_price;

    @Column(name="Image_URL")
    private String image_URL;

    @Column(name="Create_Date")
    @CreationTimestamp
    private Date create_date;

    @Column(name="Last_Update")
    @UpdateTimestamp
    private Date last_update;

    @OneToMany(cascade=CascadeType.ALL, mappedBy = "vacation")
    private Set<Excursion> excursions ;
}