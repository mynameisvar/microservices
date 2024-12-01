package dev.var.microservices.service.chat;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mynameisvar <github@mynameisvar>
 */

@RestController
@RequestMapping("/chat")
@RequiredArgsConstructor
public class ChatController {
    private final RedisTemplate<String, String> redisTemplate;

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestParam String message) {
        redisTemplate.convertAndSend("chat", message);
        return ResponseEntity.ok("Message sent");
    }
}
