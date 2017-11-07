package com.song.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by Song on 2017/11/6.
 */
@ControllerAdvice
@Slf4j
public class ExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public void exceptionHandle(Exception e) {
        log.error("", e);
    }
}
