package io.atoll.config

import net.dean.jraw.RedditClient
import net.dean.jraw.http.NetworkAdapter
import net.dean.jraw.http.OkHttpNetworkAdapter
import net.dean.jraw.http.UserAgent
import net.dean.jraw.oauth.Credentials
import net.dean.jraw.oauth.OAuthHelper
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Created on 2021/02/20.
 *
 * @author Kevin Andres
 */
@Configuration
@ConfigurationProperties(prefix = "reddit")
class RedditConfig {
    lateinit var username: String
    lateinit var password: String
    lateinit var clientId: String
    lateinit var clientSecret: String
    lateinit var appPlatform: String
    lateinit var appId: String
    lateinit var appVersion: String

    @Bean
    fun getRedditClient(): RedditClient {
        // Create our credentials
        val credentials: Credentials = Credentials.script(username, password, clientId, clientSecret)
        val userAgent = UserAgent(appPlatform, appId, appVersion, username)

        // This is what really sends HTTP requests
        val adapter: NetworkAdapter = OkHttpNetworkAdapter(userAgent)

        // Authenticate and get a RedditClient instance
        return OAuthHelper.automatic(adapter, credentials)
    }
}