package com.xulu.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Set;

/**
 * @author xulu
 * @date 2018/8/27
 * @link https://github.com/xulu163
 */
@ControllerAdvice
class GlobalExceptionHandler {

    // 根据特定的异常返回指定的 HTTP 状态码
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseBody
    public ResponseError handleValidationException(ConstraintViolationException ex) {
        Set<ConstraintViolation<?>> errors = ex.getConstraintViolations();
        StringBuilder strBuilder = new StringBuilder();
        for (ConstraintViolation<?> violation : errors) {
            strBuilder.append(violation.getMessage() + "\n");
        }
        return ResponseError.build(ResponseError.Type.BAD_REQUEST_ERROR, strBuilder.toString());
    }

    // 通用异常的处理，返回500
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseError handleException(Exception ex) {
        return ResponseError.build(ResponseError.Type.INTERNAL_SERVER_ERROR, ex.getMessage());
    }

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(BaseException.class)
    @ResponseBody
    public ResponseError handleBaseException(BaseException ex) {
        return ex.getResponseError();
    }
}