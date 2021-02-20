package io.atoll.provider.stock

import yahoofinance.Stock
import yahoofinance.YahooFinance
import yahoofinance.histquotes.Interval
import java.time.LocalDate
import java.time.ZonedDateTime
import java.util.*

/**
 * Created on 2021/02/20.
 *
 * @author Kevin Andres
 */
interface TickerFetchService {
    fun getTicker(ticker: String): Stock {
        return YahooFinance.get(ticker)
    }

    fun getTickerHistory(ticker: String, from: LocalDate, to: LocalDate, interval: Interval = Interval.DAILY): Stock {
        return YahooFinance.get(ticker, GregorianCalendar.from(ZonedDateTime.from(from)), GregorianCalendar.from(ZonedDateTime.from(to)), interval)
    }
}