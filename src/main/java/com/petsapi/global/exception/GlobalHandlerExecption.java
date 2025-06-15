package com.petsapi.global.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalHandlerExecption {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex, HttpServletRequest request) {
        ErroResponse erro = new ErroResponse(500, ex.getMessage(), LocalDateTime.now(), request.getRequestURI());
        return new ResponseEntity<>(erro.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex, HttpServletRequest request) {
        ErroResponse erro = new ErroResponse(400, ex.getMessage(), LocalDateTime.now(), request.getRequestURI());
        return new ResponseEntity<>(erro.toString(), HttpStatus.BAD_REQUEST);
    }

}
