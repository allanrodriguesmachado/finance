package br.com.service.user;

import br.com.domain.user.User;
import br.com.dto.user.CreateUserRequest;
import br.com.dto.user.UserResponse;

public class CreateUserService {
    public UserResponse execute(CreateUserRequest createUserRequest) throws Throwable {
        User user = new User(
                createUserRequest.getFullName(),
                createUserRequest.getEmail(),
                createUserRequest.getDocumentType(),
                createUserRequest.getDocumentNumber()
        );

        return null;
    }
}
