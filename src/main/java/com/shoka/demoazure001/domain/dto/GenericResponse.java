package com.shoka.demoazure001.domain.dto;

public record GenericResponse(
        Boolean ok, Integer code, String message, Object body
) {
    public GenericResponse() {
        this(true, 201, "Created", null);
    }

    public GenericResponse(String stringBody) {
        this(true, 201, "Created", stringBody);
    }
}