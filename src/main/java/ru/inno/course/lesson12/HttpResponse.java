package ru.inno.course.lesson12;

import java.util.Map;
import ru.inno.course.lesson12.firstpackage.Human;

public class HttpResponse<T> {
    private int code;

    private Map<String, String> headers;

    private T body;

    public HttpResponse(int code) {
        this.code = code;
    }
}
