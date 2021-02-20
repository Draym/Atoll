package io.atoll.provider.stock

import org.springframework.stereotype.Service
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
@Service
class TickerYahooFetchService: TickerFetchService {
    override fun getTicker(ticker: String): Stock {
        return YahooFinance.get(ticker)
    }

    override fun getTickerHistory(ticker: String, from: LocalDate, to: LocalDate, interval: Interval): Stock {
        return YahooFinance.get(ticker, GregorianCalendar.from(ZonedDateTime.from(from)), GregorianCalendar.from(ZonedDateTime.from(to)), interval)
    }
}