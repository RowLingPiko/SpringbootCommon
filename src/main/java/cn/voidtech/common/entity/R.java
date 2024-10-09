package cn.voidtech.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author RowLingKaslana
 * @project Common
 * @date 2024/10/9 11:13
 * This is the honor of the Kaslana!!!!
 * 願 人 類 榮 耀 長 存
 * 人 类 に 栄 光 あ れ
 * Glory to mankind！
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class R<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;

    /**
     * 快速返回一个枚举对象
     * @param rEnum 枚举对象
     */
    public R(REnum rEnum) {
        this.code = rEnum.getCode();
        this.msg = rEnum.getMsg();
        this.data = null;
    }

    /**
     * 快速返回一个枚举对象，并且携带数据
     * @param rEnum 枚举对象
     * @param data 数据
     */
    public R(REnum rEnum, T data) {
        this.code = rEnum.getCode();
        this.msg = rEnum.getMsg();
        this.data = data;
    }

    /**
     * 快速返回一个成功的对象
     */
    public static <T> R<T> success() {
        return new R<>(REnum.SUCCESS);
    }

    /**
     * 快速返回一个成功的对象，并且携带数据
     */
    public static <T> R<T> success(T data) {
        return new R<>(REnum.SUCCESS, data);
    }

    /**
     * 快速返回一个失败的对象
     */
    public static <T> R<T> error() {
        return new R<>(REnum.ERROR);
    }

    /**
     * 快速返回一个失败的对象，并且携带错误信息
     */
    public static <T> R<T> error(String msg) {
        return R.<T>builder().code(REnum.ERROR.getCode()).msg(msg).build();
    }

}
