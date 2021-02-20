package io.atoll.api.market

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created on 2021/02/20.
 *
 * @author Kevin Andres
 */
@RestController
@RequestMapping("/api/market/stock")
class StockMarketController {

    @GetMapping("/history/{ticker}")
    fun getTickerHistory(@PathVariable ticker: String) {

    }
}