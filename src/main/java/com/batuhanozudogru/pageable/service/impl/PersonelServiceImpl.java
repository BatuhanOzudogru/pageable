package com.batuhanozudogru.pageable.service.impl;

import com.batuhanozudogru.pageable.dto.DtoDepartment;
import com.batuhanozudogru.pageable.dto.DtoPersonel;
import com.batuhanozudogru.pageable.model.Personel;
import com.batuhanozudogru.pageable.repository.PersonelRepository;
import com.batuhanozudogru.pageable.service.PersonelService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonelServiceImpl implements PersonelService {

    @Autowired
    private PersonelRepository personelRepository;
    @Override
    public Page<Personel> findAll(Pageable pageable) {
        return personelRepository.findAll(pageable);
    }

    @Override
    public List<DtoPersonel> toDtoList(List<Personel> personelList) {


        List<DtoPersonel> dtoPersonelList = new ArrayList<>();

        for(Personel personel : personelList){
            DtoPersonel dtoPersonel = new DtoPersonel();
            DtoDepartment dtoDepartment = new DtoDepartment();

            BeanUtils.copyProperties(personel, dtoPersonel);
            BeanUtils.copyProperties(personel.getDepartment(), dtoDepartment);

            dtoPersonel.setDepartment(dtoDepartment);

            dtoPersonelList.add(dtoPersonel);
        }

        return dtoPersonelList;
    }
}
