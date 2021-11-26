package com.yjl.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author yjl
 * @Description
 * @create 2021-11-25
 */

@Component
@ConfigurationProperties(prefix = "myhello")
public class HelloProperties {
    private String start;
    private String end;

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }
}
