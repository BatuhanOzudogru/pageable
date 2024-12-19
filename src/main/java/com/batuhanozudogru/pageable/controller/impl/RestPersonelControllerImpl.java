package com.batuhanozudogru.pageable.controller.impl;

import com.batuhanozudogru.pageable.controller.RestPersonelController;
import com.batuhanozudogru.pageable.dto.DtoPersonel;
import com.batuhanozudogru.pageable.model.Personel;
import com.batuhanozudogru.pageable.service.PersonelService;
import com.batuhanozudogru.pageable.utils.RestPageableEntity;
import com.batuhanozudogru.pageable.utils.RestPageableRequest;
import com.batuhanozudogru.pageable.utils.RestRootEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/personel")
public class RestPersonelControllerImpl extends RestBaseController implements RestPersonelController {

    @Autowired
    private PersonelService personelService;

    //8080?pageNumber=0&pageSize=5&columnName=id&direction=ASC
    //@ModelAttribute

    @GetMapping("/list/pageable")
    @Override
    public RestRootEntity<RestPageableEntity<DtoPersonel>>  findAll(@ModelAttribute RestPageableRequest pageable){

        Page<Personel> page = personelService.findAll(toPageable(pageable));

        RestPageableEntity<DtoPersonel> pageableResponse = toPageableResponse(page, personelService.toDtoList(page.getContent()));


        return ok(pageableResponse);
    }
}
