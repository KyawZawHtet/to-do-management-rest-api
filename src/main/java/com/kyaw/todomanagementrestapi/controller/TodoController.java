/**
 * @Author : Kyaw Zaw Htet
 * @Date : 4/25/2024
 * @Time : 7:42 AM
 * @Project_Name : to-do-management-rest-api
 */
package com.kyaw.todomanagementrestapi.controller;

import com.kyaw.todomanagementrestapi.dto.TodoDto;
import com.kyaw.todomanagementrestapi.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/todo")
@AllArgsConstructor
public class TodoController {

    private TodoService todoService;

    // Build Get All Todo REST API
    @GetMapping
    public ResponseEntity<List<TodoDto>> getAllTodos(){
        List<TodoDto> todos = todoService.getAllTodos();
        //return new ResponseEntity<>(todos, HttpStatus.OK);
        return ResponseEntity.ok(todos);
    }

    // Build Get Todo REST API
    @GetMapping("{todoId}")
    public ResponseEntity<TodoDto> getTodo(@PathVariable("todoId") Long id){
        TodoDto todoDto = todoService.getTodo(id);
        return new ResponseEntity<>(todoDto, HttpStatus.OK);
    }

    // Build Add Todo REST API
    @PostMapping("/")
    public ResponseEntity<TodoDto> addTodo(@RequestBody TodoDto todoDto){
        TodoDto savedTodo = todoService.addTodo(todoDto);
        return new ResponseEntity<>(savedTodo, HttpStatus.CREATED);
    }

    // Build Update Todo REST API
    @PutMapping("/{todoId}")
    public ResponseEntity<TodoDto> updateTodo(@RequestBody TodoDto todoDto, @PathVariable("todoId") Long todoId){
       TodoDto updatedTodo = todoService.updateTodo(todoDto, todoId);
       return ResponseEntity.ok(updatedTodo);
    }

    // Build Delete Todo REST API
    @DeleteMapping("/{todoId}")
    public ResponseEntity<String> deleteToto(@PathVariable("todoId") Long todoId){
        todoService.deleteTodo(todoId);
        return ResponseEntity.ok("Todo delete successfully!");
    }

    // Build Complete Todo REST API
    @PatchMapping("{todoId}/complete")
    public ResponseEntity<TodoDto> completeTodo(@PathVariable("todoId") Long todoId){
        TodoDto updatedTodo = todoService.completeTodo(todoId);
        return ResponseEntity.ok(updatedTodo);
    }

    //Build InComplete Todo Rest API
    @PatchMapping("{todoId}/in-complete")
    public ResponseEntity<TodoDto> inCompleteTodo(@PathVariable("todoId") Long todoId){
        TodoDto updatedTodo = todoService.inCompleteTodo(todoId);
        return ResponseEntity.ok(updatedTodo);
    }
}
