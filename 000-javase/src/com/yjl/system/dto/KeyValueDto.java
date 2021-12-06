package com.yjl.system.dto;

/**
 * @author yjl
 * @Description
 * @create 2021-11-30
 */
public class KeyValueDto {
    private String message;
    private Integer code;

    public KeyValueDto() {
    }

    public KeyValueDto(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "KeyValueDto{" +
                "message='" + message + '\'' +
                ", code=" + code +
                '}';
    }
}
