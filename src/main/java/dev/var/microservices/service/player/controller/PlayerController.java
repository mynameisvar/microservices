package dev.var.microservices.service.player.controller;

import dev.var.microservices.service.player.Player;
import dev.var.microservices.service.player.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author mynameisvar <github@mynameisvar>
 */

@RestController
@RequestMapping("/players")
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService playerService;

    @GetMapping("/uuid")
    public ResponseEntity<Player> getPlayer(@PathVariable String uuid) {
        return ResponseEntity.ok(playerService.findByUuid(uuid));
    }

    @PostMapping
    public ResponseEntity<Player> addPlayer(@RequestBody Player player) {
        return ResponseEntity.ok(playerService.savePlayer(player));
    }
}
