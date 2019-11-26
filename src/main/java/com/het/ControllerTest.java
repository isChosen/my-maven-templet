package com.het;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: hotel-het-web
 * @description:
 * @author: LiMing
 * @create: 2019-11-13 11:04
 **/
@Controller
public class ControllerTest {

    @ResponseBody
    @RequestMapping("/user/test")
    public Object test() {
        return "123";
    }

}
