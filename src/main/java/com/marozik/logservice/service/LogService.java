package com.marozik.logservice.service;

import com.marozik.logservice.dto.AnswerDto;
import com.marozik.logservice.dto.UserDto;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.slf4j.LoggerFactory.getLogger;

@Service
public class LogService {
    private static final Logger log = getLogger(LogService.class);

    @Value("${spring.log-service.pattern}")
    private String pattern;

    public AnswerDto addData(UserDto userDto) {

        log.info(
                LocalDateTime.now().format(DateTimeFormatter.ofPattern(pattern)) +
                        " " + "user_id:" + userDto.getUserId() +
                        " " + "user_data:" + userDto.getUserData()
        );

        return AnswerDto.builder().answer("Processed successfully").build();
    }
}
