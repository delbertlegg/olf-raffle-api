package com.eddielegg.olfraffleapi

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.filter.CommonsRequestLoggingFilter

@Configuration
class LoggingConfig {
    @Bean
    fun requestLoggingFilter(): CommonsRequestLoggingFilter {
        val requestLoggingFilter = CommonsRequestLoggingFilter()
        requestLoggingFilter.setIncludeClientInfo(true)
        requestLoggingFilter.setIncludeHeaders(true)
        requestLoggingFilter.setIncludeQueryString(true)
        requestLoggingFilter.setIncludePayload(true)
        return requestLoggingFilter
    }
}