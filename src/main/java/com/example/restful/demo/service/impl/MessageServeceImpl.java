package com.example.restful.demo.service.impl;

import com.example.restful.demo.exception.CustomException;
import com.example.restful.demo.pojo.Message;
import com.example.restful.demo.repository.MessageRepository;
import com.example.restful.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServeceImpl implements MessageService {

    @Autowired
    private MessageRepository repository;
    @Override
    public List<Message> findAll() {
        return repository.findAll();
    }

    @Override
    public Message findOne(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Message save(Message message) throws CustomException  {
        return repository.save(message);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public Message update(Message message) throws CustomException  {
        return repository.update(message);
    }

    @Override
    public Message updateText(Message message) throws CustomException {
        return repository.updateText(message);
    }
}
