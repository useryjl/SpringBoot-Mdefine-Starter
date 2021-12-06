package com.yjl.system;

/**
 * @author yjl
 * @Description
 * @create 2021-11-30
 */
public class KeyValueDto implements Comparable<KeyValueDto> {
    public String key;
    public String value;

    @Override
    public String toString() {
        return "KeyValueDto{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public KeyValueDto(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int compareTo(KeyValueDto o) {
        //this 代表当前对象
        return o.getKey().compareTo(this.key);
    }
}
