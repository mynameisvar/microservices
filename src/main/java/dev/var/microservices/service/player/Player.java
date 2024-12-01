package dev.var.microservices.service.player;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

/**
 * @author mynameisvar <github@mynameisvar>
 */

@Data
@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String uuid;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;
}
