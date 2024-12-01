package dev.var.microservices.service.player.repository;

import dev.var.microservices.service.player.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author mynameisvar <github@mynameisvar>
 */

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    Optional<Player> findByUuid(String uuid);
}
