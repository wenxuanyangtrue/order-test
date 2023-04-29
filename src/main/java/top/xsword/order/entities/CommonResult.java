package top.xsword.order.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: ywx
 * Create Time: 2023/4/28
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public static <T> CommonResult<T> ok(T data) {
        return new CommonResult<>(10000, null, data);
    }

    public static <T> CommonResult<T> ok(String message) {
        return new CommonResult<>(10000, message, null);
    }

    public static <T> CommonResult<T> ok(T data, String message) {
        return new CommonResult<>(10000, message, data);
    }


    public static <T> CommonResult<T> ok() {
        return ok(null);
    }

    public static <T> CommonResult<T> fail(T data, String message) {
        return new CommonResult<>(400, message, data);
    }

    public static <T> CommonResult<T> fail(String message) {
        return fail(null, message);
    }

    public static <T> CommonResult<T> fail() {
        return fail(null, null);
    }
}
