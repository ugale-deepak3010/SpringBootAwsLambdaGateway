package com.todo.todo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.todo.Model.Todo;
import com.todo.todo.Repository.TodoRepo;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;

    @GetMapping("")
    public List<Todo> getMethodName() {
        return todoRepo.findAll();
    }

    @PostMapping("")
    public Todo postMethodName(@RequestBody Todo entity) {
        return todoRepo.save(entity);
    }

    @PutMapping("/{id}")
    public Todo putMethodName(@PathVariable String id, @RequestBody Todo entity) {

        return todoRepo.save(entity);
    }

    @DeleteMapping("/{id}")
    public String getMethodName(@PathVariable Long id) {
        todoRepo.deleteById(id);
        return "deleted";
    }

}
