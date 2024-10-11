package cn.voidtech.common.controller.restController;

import cn.voidtech.common.entity.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RowLingKaslana
 * @project Common
 * @date 2024/10/9 15:58
 * This is the honor of the Kaslana!!!!
 * 願 人 類 榮 耀 長 存
 * 人 类 に 栄 光 あ れ
 * Glory to mankind！
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping
    public R<?> test(){
        return R.success();
    }
}
