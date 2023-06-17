package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        // Hata mesajını burada döndürebilirsiniz
        return new ResponseEntity<>("Bir hata oluştu", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
