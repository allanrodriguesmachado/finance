package br.com.dto.user;

import br.com.domain.user.DocumentType;

public class CreateUserRequest {
    private String fullName;
    private String email;
    private DocumentType documentType;
    private String documentNumber;

    public String getFullName() {
        return this.fullName;
    }

    public String getEmail() {
        return this.email;
    }

    public DocumentType getDocumentType() {
        return this.documentType;
    }

    public String getDocumentNumber() {
        return this.documentNumber;
    }
}