package br.com.domain.credential;

import java.time.LocalDateTime;

public class UserCredential {
    private Long id;
    private Long userId;
    private String passwordHash;
    private LocalDateTime passwordUpdatedAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
