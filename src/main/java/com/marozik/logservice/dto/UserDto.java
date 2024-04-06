package com.marozik.logservice.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    @NotNull
    private Long userId;

    @NotNull
    private String userData;
}
