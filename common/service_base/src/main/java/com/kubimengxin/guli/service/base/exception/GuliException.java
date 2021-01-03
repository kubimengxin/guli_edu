package com.kubimengxin.guli.service.base.exception;

import com.kubimengxin.guli.common.base.result.ResultCodeEnum;
import lombok.Data;

/**
 * @author 苦逼萌新
 * @date 2021/1/3
 */
@Data
public class GuliException extends RuntimeException {

    private Integer code;

    public GuliException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public GuliException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "GuliException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }
}
