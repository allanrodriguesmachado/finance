package br.com.dto.user;

import br.com.domain.user.DocumentType;

public class CreateUserRequest {
    private String fullName;
    private String email;
    private DocumentType documentType;
    private String documentNumber;
}
