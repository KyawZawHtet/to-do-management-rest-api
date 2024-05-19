/**
 * @Author : Kyaw Zaw Htet
 * @Date : 4/25/2024
 * @Time : 7:31 AM
 * @Project_Name : to-do-management-rest-api
 */
package com.kyaw.todomanagementrestapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TodoDto {

    private Long id;
    private String title;
    private String description;
    private boolean completed;
}
