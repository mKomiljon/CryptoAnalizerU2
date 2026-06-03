package com.javarush.makhmudov.entity;

public class Result {
    public final String message;

    public final ResultCode resultCode;

    public Result(ResultCode resultCode, String message) {
        this.message = message;
        this.resultCode = resultCode;
    }

    @Override
    public String toString() {
        return "Result{" +
                "message='" + message + '\'' +
                ", resultCode=" + resultCode +
                '}';
    }
}
