package com.blink.server.chat.repository;

import com.blink.server.chat.entity.Message;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface MessageRepository extends ReactiveCrudRepository<Message, Long> {
    Flux<Message> findBySenderName(String senderName);
    Flux<Message> findByRoomId(String roomId);
}