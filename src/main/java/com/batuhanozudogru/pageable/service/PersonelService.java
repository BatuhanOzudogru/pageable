package com.batuhanozudogru.pageable.service;

import com.batuhanozudogru.pageable.dto.DtoPersonel;
import com.batuhanozudogru.pageable.model.Personel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface PersonelService {


    Page<Personel> findAll(Pageable pageable);

    List<DtoPersonel> toDtoList(List<Personel> personelList);
}
