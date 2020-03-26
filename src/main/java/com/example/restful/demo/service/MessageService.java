package com.example.restful.demo.service;

import com.example.restful.demo.exception.CustomException;
import com.example.restful.demo.pojo.Message;

import java.util.List;

public interface MessageService {
    List<Message> findAll();
    Message findOne(Long id);
    Message save(Message message) throws CustomException;
    void delete(Long id);
    Message update(Message message) throws CustomException;
    Message updateText(Message message) throws CustomException;
}
