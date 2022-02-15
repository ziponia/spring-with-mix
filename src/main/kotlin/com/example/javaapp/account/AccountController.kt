package com.example.javaapp.account

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AccountController {

    /**
     * 회원가입
     */
    @GetMapping(value = ["/accounts/register"])
    fun addAccount(): String {

        return "account/register"
    }
}
