package com.batuhanozudogru.pageable.controller.impl;

import com.batuhanozudogru.pageable.utils.PagerUtil;
import com.batuhanozudogru.pageable.utils.RestPageableEntity;
import com.batuhanozudogru.pageable.utils.RestPageableRequest;
import com.batuhanozudogru.pageable.utils.RestRootEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class RestBaseController {

    public Pageable toPageable(RestPageableRequest request){
        return PagerUtil.toPageable(request);
    }

    public <T> RestPageableEntity<T> toPageableResponse(Page<?> page, List<T> content){
        return toPageableResponse(page, content);
    }


    public <T> RestRootEntity<T> ok(T payload){
        return RestRootEntity.ok(payload);
    }
}
