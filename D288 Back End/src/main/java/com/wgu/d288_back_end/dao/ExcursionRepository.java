package com.wgu.d288_back_end.dao;

import com.wgu.d288_back_end.entities.Excursion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Project: D288 Back End
 * Package: com.wgu.d288_back_end.repositories
 * <p>
 * User: carolyn.sher
 * Date: 7/23/2022
 * Time: 10:54 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@CrossOrigin("http://localhost:4200")
public interface ExcursionRepository extends JpaRepository<Excursion, Long> {
}
