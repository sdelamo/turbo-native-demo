package io.micronaut.turbo.model

import io.micronaut.core.annotation.Introspected
import java.time.ZoneOffset
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

@Introspected
data class ViewModel(val pageTitle: String, val pageClass: String = "", val action: String? = null) {
    val renderDate: String get() = ZonedDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.RFC_1123_DATE_TIME)
}