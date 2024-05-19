/**
 * @Author : Kyaw Zaw Htet
 * @Date : 4/25/2024
 * @Time : 7:29 AM
 * @Project_Name : to-do-management-rest-api
 */
package com.kyaw.todomanagementrestapi.repository;

import com.kyaw.todomanagementrestapi.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
