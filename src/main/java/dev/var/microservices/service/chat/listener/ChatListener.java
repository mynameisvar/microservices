package dev.var.microservices.service.chat.listener;

import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author mynameisvar <github@mynameisvar>
 */

@Component
@RequiredArgsConstructor
public class ChatListener {
    @EventListener
    public void onMessage(String message) {
        System.out.println("Chat message: " + message);
    }
}
