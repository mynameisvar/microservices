package dev.var.microservices.service.command;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mynameisvar <github@mynameisvar>
 */

@RestController
@RequestMapping("/commands")
@RequiredArgsConstructor
public class CommandController {
    @PostMapping("/execute")
    public ResponseEntity<String> executeCommand(@RequestParam String command) {
        switch (command.toLowerCase()) {
            case "help":
                return ResponseEntity.ok("Microservices by @mynameisvar");
            default:
                return ResponseEntity.ok("Unknown command :(");
        }
    }
}
