package de.kottilabs.todobackend.dao;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, UUID> {
}
