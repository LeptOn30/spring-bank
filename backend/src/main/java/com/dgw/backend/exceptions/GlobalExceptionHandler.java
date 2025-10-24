package com.dgw.backend.exceptions;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.dgw.backend.res.Response;

import lombok.RequiredArgsConstructor;


@ControllerAdvice
@RequiredArgsConstructor
public class GlobalExceptionHandler {

    private final MessageSource messageSource;

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response<?>> handleAllUnknownExceptions(Exception ex){
        Locale locale = LocaleContextHolder.getLocale();
        String message = messageSource.getMessage("error.internal", null, locale);

        Response<?> response = Response.builder()
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .message(message)
                .build();

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Response<?>> handleNotFoundException(NotFoundException ex){
        Locale locale = LocaleContextHolder.getLocale();
        String message = messageSource.getMessage(ex.getMessage(), null, locale);

        Response<?> response = Response.builder()
                .statusCode(HttpStatus.NOT_FOUND.value())
                .message(message)
                .build();

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(InsufficientBalanceException.class)
    public ResponseEntity<Response<?>> handleInsufficientBalance(InsufficientBalanceException ex){
        Locale locale = LocaleContextHolder.getLocale();
        String message = messageSource.getMessage(ex.getMessage(), null, locale);

        Response<?> response = Response.builder()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .message(message)
                .build();

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidTransactionException.class)
    public ResponseEntity<Response<?>> handleInvalidTransaction(InvalidTransactionException ex){
        Locale locale = LocaleContextHolder.getLocale();
        String message = messageSource.getMessage(ex.getMessage(), null, locale);

        Response<?> response = Response.builder()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .message(message)
                .build();

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<Response<?>> handleBadRequestException(BadRequestException ex){
        Locale locale = LocaleContextHolder.getLocale();
        String message = messageSource.getMessage(ex.getMessage(), null, locale);

        Response<?> response = Response.builder()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .message(message)
                .build();

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

}
