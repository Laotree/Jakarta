package com.boot.base.enums;

public enum ResponseEnum {
    SUCCESS(200, "操作成功"),
    DATA_ERROR(300, "数据错误，不存在"),
    PARAMETER_ERROR(400, "参数错误"),
    SERVER_ERROR(500, "系统错误"),
    OTHER_ERROR(600, "其它错误"),
    DATA_REPEAT(1100, "数据重复");

    private int value;

    private String name;

    ResponseEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }

    public static ResponseEnum valueOf(int value) {
        for (ResponseEnum p : values()) {
            if (p.getValue() == value) {
                return p;
            }
        }
        return null;
    }

    public static String getNameByValue(int value) {
        ResponseEnum tempEnum = valueOf(value);
        if (tempEnum == null) {
            return null;
        }
        return tempEnum.getName();
    }
}
