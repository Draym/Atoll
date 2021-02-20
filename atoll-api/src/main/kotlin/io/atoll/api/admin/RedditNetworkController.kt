package io.atoll.api.admin

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created on 2021/02/20.
 *
 * @author Kevin Andres
 */
@RestController
@RequestMapping("/api/admin/network/reddit")
class RedditNetworkController {

    @PostMapping("/channel/add")
    fun addChannel() {

    }

    @PostMapping("/channel/delete")
    fun deleteChannel() {

    }

    @PostMapping("/channel/reload")
    fun reloadChannel() {

    }
}