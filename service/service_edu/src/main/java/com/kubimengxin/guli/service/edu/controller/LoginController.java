package com.kubimengxin.guli.service.edu.controller;

import com.kubimengxin.guli.common.base.result.R;
import org.springframework.web.bind.annotation.*;

/**
 * @author 苦逼萌新
 * @date 2020/11/27
 */
@CrossOrigin
@RestController
@RequestMapping("/user")
public class LoginController {

    @PostMapping("/login")
    public R login() {
        return R.ok().data("token", "admin");
    }

    @GetMapping("info")
    public R info() {
        return R.ok()
                .data("name", "admin")
                .data("roles", "[admin]")
                .data("avatar", "https://img.iplaysoft.com/wp-content/uploads/2019/free-images/free_stock_photo.jpg!0x0.webp");
    }

    @PostMapping("logout")
    public R logout() {
        return R.ok();
    }
}
