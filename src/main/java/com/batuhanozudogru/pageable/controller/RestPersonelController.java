package com.batuhanozudogru.pageable.controller;

import com.batuhanozudogru.pageable.dto.DtoPersonel;
import com.batuhanozudogru.pageable.model.Personel;
import com.batuhanozudogru.pageable.utils.RestPageableEntity;
import com.batuhanozudogru.pageable.utils.RestPageableRequest;
import com.batuhanozudogru.pageable.utils.RestRootEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RestPersonelController {

    public RestRootEntity<RestPageableEntity<DtoPersonel>> findAll(RestPageableRequest restPageableRequest);

}
