package com.batuhanozudogru.pageable.utils;


import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class RestRootEntity <T>{

    private Integer status;

    private T payload;

    private String errorMessage;

    public static <T> RestRootEntity ok(T payload){
        RestRootEntity<T> restRootEntity = new RestRootEntity<>();
        restRootEntity.setStatus(HttpStatus.OK.value());
        restRootEntity.setPayload(payload);
        restRootEntity.setErrorMessage(null);

        return restRootEntity;
    }
}
