package com.blink.server.configure;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.messaging.SessionConnectEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
public class WebSocketEventListener {

    private static final Logger logger = LoggerFactory.getLogger(WebSocketEventListener.class);

    @EventListener
    public void handleWebSocketConnectListener(SessionConnectEvent event) {
        logger.info("WebSocket 연결: {}", event.getMessage());
    }
    @EventListener
    public void onApplicationEvent(SessionConnectEvent event) {
        String simpSessionId = (String) event.getMessage().getHeaders().get("simpSessionId");
        System.out.println("웹소켓 연결 요청: " + simpSessionId);
    }
    @EventListener
    public void handleWebSocketDisconnectListener(SessionDisconnectEvent event) {
        logger.info("WebSocket 연결 해제: {}", event.getSessionId());
    }
}//웹소켓 연결 됬는지 확인
