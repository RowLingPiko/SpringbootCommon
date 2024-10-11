package cn.voidtech.common.config.handler;

import cn.dev33.satoken.exception.NotLoginException;
import cn.dev33.satoken.exception.NotPermissionException;
import cn.dev33.satoken.exception.SaTokenException;
import cn.voidtech.common.entity.R;
import cn.voidtech.common.entity.REnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author RowLingKaslana
 * @project Common
 * @date 2024/10/9 16:11
 * This is the honor of the Kaslana!!!!
 * 願 人 類 榮 耀 長 存
 * 人 类 に 栄 光 あ れ
 * Glory to mankind！
 */
@Slf4j
@RestControllerAdvice
public class ExceptionHandlerAdvice {
    @ExceptionHandler(SaTokenException.class)
    public R<?> handleSaTokenException(SaTokenException e){
        log.error("SaToken异常",e.getMessage());
        return new R<>(REnum.UNAUTHORIZED);
    }

    @ExceptionHandler(NotLoginException.class)
    public R<?> handleNotLoginException(NotLoginException e){
        log.error("未登录异常",e.getMessage());
        return new R<>(REnum.FORBIDDEN);
    }

    @ExceptionHandler(NotPermissionException.class)
    public R<?> handleNotPermissionException(NotPermissionException e){
        log.error("权限不足异常",e.getMessage());
        return new R<>(REnum.FORBIDDEN);
    }
    @ExceptionHandler(RuntimeException.class)
    public R<?> handleRuntimeException(RuntimeException e){
        log.error("运行时异常",e);
        return R.error(e.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public R<?> handleException(Exception e) {
        log.error("未知异常",e.getMessage());
        return R.error(e.getMessage());
    }
}
