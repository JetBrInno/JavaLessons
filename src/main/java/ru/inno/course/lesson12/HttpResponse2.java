package ru.inno.course.lesson12;

import java.util.Map;

public class HttpResponse2<T,K,M> {
    private int code;

    private Map<String, String> headers;

    private T body;

    private K body2;

    private M body3;

    public HttpResponse2(int code) {
        this.code = code;
    }
}
