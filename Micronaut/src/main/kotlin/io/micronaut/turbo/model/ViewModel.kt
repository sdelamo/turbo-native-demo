package io.micronaut.turbo.model

import io.micronaut.core.annotation.Introspected
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

@Introspected
data class ViewModel(val pageTitle: String, val pageClass: String? = null, val action: String? = null) {
    val renderDate: String get() = ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME)
}