package br.com.domain.address;

import br.com.domain.user.User;

import java.time.LocalDateTime;

public class Address {
    private Long id;
    private Long userId;
    private String label;
    private String postalCode;
    private String street;
    private String number;
    private String complement;
    private String neighborhood;
    private String city;
    private String stateCode;
    private CountryCode countryCode = CountryCode.BR;
    private boolean isPrimary = false;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime archivedAt;
}
