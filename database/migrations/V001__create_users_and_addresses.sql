CREATE TABLE users (
    id BIGSERIAL PRIMARY KEY,
    full_name VARCHAR(150) NOT NULL,
    email VARCHAR(255) NOT NULL,
    document_type VARCHAR(20) NOT NULL,
    document_number VARCHAR(30) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    cancelled_at TIMESTAMP NULL,

    CONSTRAINT uq_users_document_number
        UNIQUE (document_number),

    CONSTRAINT chk_users_document_type
        CHECK (document_type IN ('CPF', 'RG', 'PASSPORT'))
);

CREATE UNIQUE INDEX uq_users_email_ci
ON users (LOWER(email));


CREATE TABLE addresses (
    id BIGSERIAL PRIMARY KEY,
    user_id BIGINT NOT NULL REFERENCES users(id),
    label VARCHAR(50) NOT NULL,
    postal_code VARCHAR(20) NOT NULL,
    street VARCHAR(150) NOT NULL,
    number VARCHAR(20) NOT NULL,
    complement VARCHAR(100),
    neighborhood VARCHAR(100) NOT NULL,
    city VARCHAR(100) NOT NULL,
    state_code VARCHAR(10) NOT NULL,
    country_code CHAR(2) NOT NULL DEFAULT 'BR',
    is_primary BOOLEAN NOT NULL DEFAULT FALSE,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    archived_at TIMESTAMP NULL
);

CREATE UNIQUE INDEX uq_addresses_one_active_primary
ON addresses (user_id)
WHERE is_primary = TRUE
  AND archived_at IS NULL;