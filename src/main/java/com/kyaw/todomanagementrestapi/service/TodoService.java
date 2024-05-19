/**
 * @Author : Kyaw Zaw Htet
 * @Date : 4/25/2024
 * @Time : 7:34 AM
 * @Project_Name : to-do-management-rest-api
 */
package com.kyaw.todomanagementrestapi.service;

import com.kyaw.todomanagementrestapi.dto.TodoDto;

import java.util.List;

public interface TodoService {

    List<TodoDto> getAllTodos();
    TodoDto getTodo(Long id);
    TodoDto addTodo(TodoDto todoDto);
    TodoDto updateTodo(TodoDto todoDto, Long id);
    void deleteTodo(Long id);
    TodoDto completeTodo(Long id);

    TodoDto inCompleteTodo(Long id);
}
