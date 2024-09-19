package me.aws.exam.service;

import me.aws.exam.model.TodoEntity;
import me.aws.exam.persistence.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public String testService() {

        // TodoEntity 생성
        TodoEntity todoEntity = TodoEntity.builder().title("My first todo item").build();

        // TodoEntity 저장
        todoRepository.save(todoEntity);

        // TodoEntity 검색
        TodoEntity savedTodoEntity = todoRepository.findById(todoEntity.getId()).get();

        return savedTodoEntity.getTitle();
    }
}
