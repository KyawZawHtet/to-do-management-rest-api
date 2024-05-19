/**
 * @Author : Kyaw Zaw Htet
 * @Date : 5/13/2024
 * @Time : 9:51 PM
 * @Project_Name : to-do-management-rest-api
 */
package com.kyaw.todomanagementrestapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
