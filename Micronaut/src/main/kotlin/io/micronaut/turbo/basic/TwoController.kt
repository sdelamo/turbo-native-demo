package io.micronaut.turbo.basic

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue
import io.micronaut.turbo.model.ViewModel
import io.micronaut.views.View
import io.micronaut.views.turbo.TurboView

@Controller("/two")
class TwoController {

    @View("two")
    @TurboView("two")
    @Get(produces = [MediaType.TEXT_HTML], consumes = [MediaType.TEXT_HTML])
    fun index(@QueryValue action: String?) = ViewModel("Push or Replace?", action = action)
}