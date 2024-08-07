package com.kayzej.jeffwebsiteapi.service;

import com.kayzej.jeffwebsiteapi.entity.Message;
// import com.kayzej.jeffwebsiteapi.repository.MessageRepository;

public class MessageServiceImpl implements MessageService {
  // MessageRepository messageRepository;

  @Override
  public Message saveMessage(Message message) {
    // return messageRepository.save(message);
    return new Message();
  }
}
