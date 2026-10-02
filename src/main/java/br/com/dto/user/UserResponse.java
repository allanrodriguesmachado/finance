package br.com.dto.user;

import br.com.domain.user.DocumentType;

import java.time.LocalDateTime;

public class UserResponse {
    private Long id;
    private String fullName;
    private String email;
    private DocumentType documentType;
    private String documentNumber;
    private LocalDateTime createdAt;
}
