package cn.laonxs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试功能
 *
 * @author ade
 * @version 1.0，2020-05-17 12:17:26
 */
@RestController  // @RestController = @ResponseBody + @Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping("/quick")
    // @ResponseBody：将java对象转为json格式的数据，可以使用在方法上，也可以直接在类上
    public String quick() {
        return "quick start !!";
    }

}
