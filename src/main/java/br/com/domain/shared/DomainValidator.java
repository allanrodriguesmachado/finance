package br.com.domain.shared;

import java.util.Objects;

public final class DomainValidator {
    private DomainValidator() {}

    public static String notBlank(String value, String field) throws Throwable {
        if (Objects.equals(value, "") || value.isBlank()) {
            throw new Throwable(field + "é obrigatorio");
        }

        return value.trim();
    }

    public static String notNull(String value, String field) throws Throwable
    {
        if(Objects.isNull(value)) {
            throw new Throwable(field + "é obrigatorio");
        }

        return value.trim();
    }
}
