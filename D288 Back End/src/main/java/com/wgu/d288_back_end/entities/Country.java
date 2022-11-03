package com.wgu.d288_back_end.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
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
@Table(name="countries")
@Getter
@Setter
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Country_ID")
    private Long id;

    @Column(name="country")
    private String country_name;

    @OneToMany(cascade=CascadeType.ALL, mappedBy = "country")
    private Set<Division> divisions ;

    @Column(name="Create_Date")
    @CreationTimestamp
    private Date create_date;

    @Column(name="Last_Update")
    @UpdateTimestamp
    private Date last_update;
}
