package io.atoll.api.search

import org.springframework.web.bind.annotation.*

/**
 * Created on 2021/02/20.
 *
 * @author Kevin Andres
 */
@RestController
@RequestMapping("/api/search/ticker")
class TickerSearchController {

    @GetMapping
    fun searchTicker(@RequestParam search: String) {

    }

    @GetMapping("/try-get/{ticker}")
    fun validateTickerSearch(@PathVariable ticker: String) {

    }
}