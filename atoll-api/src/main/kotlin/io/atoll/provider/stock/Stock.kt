package io.atoll.provider.stock

import java.math.BigDecimal
import java.util.*

/**
 * Created on 2021/02/20.
 *
 * @author Kevin Andres
 */
data class Stock(
    val symbol: String?,
    val name: String,
    val currency: String,
    val stockExchange: String,
    val quote: StockQuote,
    val stats: StockStats,
    val dividend: StockDividend,
    val history: List<HistoricalQuote>,
    val dividendHistory: List<HistoricalDividend>,
    val splitHistory: List<HistoricalSplit>?,
) {
    data class StockQuote(
        val symbol: String?,
        val timeZone: TimeZone,
        val ask: BigDecimal,
        val askSize: Long,
        val bid: BigDecimal,
        val bidSize: Long,
        val price: BigDecimal,
        val lastTradeSize: Long,
        val lastTradeDateStr: String,
        val lastTradeTimeStr: String,
        val lastTradeTime: Calendar,
        val open: BigDecimal,
        val previousClose: BigDecimal,
        val dayLow: BigDecimal,
        val dayHigh: BigDecimal,
        val yearLow: BigDecimal,
        val yearHigh: BigDecimal,
        val priceAvg50: BigDecimal,
        val priceAvg200: BigDecimal,
        val volume: Long,
        val avgVolume: Long?
    )

    data class StockDividend(
        val symbol: String?,
        val payDate: Calendar,
        val exDate: Calendar,
        val annualYield: BigDecimal,
        val annualYieldPercent: BigDecimal?,
    )

    data class StockStats(
        val symbol: String?,
        val marketCap: BigDecimal,
        val sharesFloat: Long,
        val sharesOutstanding: Long,
        val sharesOwned: Long,
        val eps: BigDecimal,
        val pe: BigDecimal,
        val peg: BigDecimal,
        val epsEstimateCurrentYear: BigDecimal,
        val epsEstimateNextQuarter: BigDecimal,
        val epsEstimateNextYear: BigDecimal,
        val priceBook: BigDecimal,
        val priceSales: BigDecimal,
        val bookValuePerShare: BigDecimal,
        val revenue: BigDecimal,
        val EBITDA: BigDecimal,
        val oneYearTargetPrice: BigDecimal,
        val shortRatio: BigDecimal,
        val earningsAnnouncement: Calendar?
    )

    data class HistoricalQuote(
        private var symbol: String?,
        val date: Calendar,
        val open: BigDecimal,
        val low: BigDecimal,
        val high: BigDecimal,
        val close: BigDecimal,
        val adjClose: BigDecimal,
        val volume: Long?,
    )

    data class HistoricalDividend(
        private var symbol: String?,
        val date: Calendar,
        val adjDividend: BigDecimal?
    )

    data class HistoricalSplit(
        var symbol: String?,
        val date: Calendar,
        val numerator: BigDecimal,
        val denominator: BigDecimal?
    )
}