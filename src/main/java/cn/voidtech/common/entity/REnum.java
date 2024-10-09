package cn.voidtech.common.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author RowLingKaslana
 * @project Common
 * @date 2024/10/9 11:15
 * This is the honor of the Kaslana!!!!
 * 願 人 類 榮 耀 長 存
 * 人 类 に 栄 光 あ れ
 * Glory to mankind！
 */
@Getter
@AllArgsConstructor
public enum REnum {

    SUCCESS(200,"操作成功"),
    ERROR(500,"操作失败"),
    PARAM_ERROR(400,"参数错误"),
    NOT_FOUND(404,"未找到该资源"),
    UNAUTHORIZED(401,"未授权"),
    FORBIDDEN(403,"禁止访问"),
    NOT_SUPPORT(405,"不支持该请求"),
    SERVER_ERROR(500,"服务器错误");

    private final Integer code;
    private final String msg;
}
