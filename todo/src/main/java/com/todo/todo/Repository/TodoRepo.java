package com.todo.todo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.todo.Model.Todo;

public interface TodoRepo extends JpaRepository<Todo, Long> {

}
