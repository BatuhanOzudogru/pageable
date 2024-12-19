package com.batuhanozudogru.pageable.repository;

import com.batuhanozudogru.pageable.model.Personel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonelRepository extends JpaRepository<Personel, Long> {


    Page<Personel> findAll(Pageable pageable);
}
