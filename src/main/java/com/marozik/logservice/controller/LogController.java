package com.marozik.logservice.controller;

import com.marozik.logservice.dto.AnswerDto;
import com.marozik.logservice.dto.UserDto;
import com.marozik.logservice.service.LogService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LogController {

    private final LogService logService;

    @PostMapping("/add_data")
    public AnswerDto addData(@Valid @RequestBody UserDto userDto) {
        return logService.addData(userDto);
    }
}
