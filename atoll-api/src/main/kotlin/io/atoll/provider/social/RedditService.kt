package io.atoll.provider.social

import net.dean.jraw.RedditClient
import org.springframework.stereotype.Service

/**
 * Created on 2021/02/20.
 *
 * @author Kevin Andres
 */
@Service
class RedditService(
    private val redditClient: RedditClient
) {
}