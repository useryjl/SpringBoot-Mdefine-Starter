package com.example.demo.util;

import lombok.Data;

/**
 * @author yjl
 * @Description
 * @create 2021-12-10
 */
@Data
public class JsonResult {
    /*组装后端返回的Json格式的数据*/
    private String msg;
    private Integer code;
    private Integer count;
    private Object data;

    public JsonResult() {
    }

    public JsonResult(Integer code) {
        this.code = code;
    }

    public JsonResult(Integer code, Integer count) {
        this.code = code;
        this.count = count;
    }

    public JsonResult(Integer code, Integer count, Object data) {
        this.code = code;
        this.count = count;
        this.data = data;
    }

    public JsonResult(String msg, Integer code, Integer count, Object data) {
        this.msg = msg;
        this.code = code;
        this.count = count;
        this.data = data;
    }

    public JsonResult(String msg, Integer code, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public JsonResult(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }
}
