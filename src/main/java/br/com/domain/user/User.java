package br.com.domain.user;

import java.time.LocalDateTime;

import static br.com.domain.shared.DomainValidator.notBlank;


public class User {
    private Long id;
    private String fullName;
    private String email;
    private DocumentType documentType;
    private String documentNumber;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime cancelledAt;

    public User(String fullName, String email, DocumentType documentType, String documentNumber) throws Throwable {
        this.fullName = notBlank(fullName, fullName);
        this.email = email;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
}