package ru.inno.course.lesson12;

import java.util.Map;

public class HttpResponse2<T,K> {
    private int code;

    private Map<String, String> headers;

    private T body;

    private K body2;

    public HttpResponse2(int code) {
        this.code = code;
    }
}
