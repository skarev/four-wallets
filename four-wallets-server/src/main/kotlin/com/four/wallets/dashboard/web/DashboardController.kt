package com.four.wallets.dashboard.web

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DashboardController {

    @RequestMapping(value = "/")
    fun mainInfo() = "Main info"
}
