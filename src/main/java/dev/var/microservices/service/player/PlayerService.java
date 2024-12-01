package dev.var.microservices.service.player;

import dev.var.microservices.service.player.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author mynameisvar <github@mynameisvar>
 */

@Service
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerRepository playerRepository;

    public Player findByUuid(String uuid) {
        return playerRepository.findByUuid(uuid)
                .orElseThrow(() -> new RuntimeException("Player not found!"));
    }

    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }
}
