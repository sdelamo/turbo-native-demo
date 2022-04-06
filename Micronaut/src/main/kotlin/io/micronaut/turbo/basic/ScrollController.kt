package io.micronaut.turbo.basic

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Consumes
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.turbo.model.ViewModel
import io.micronaut.views.View
import io.micronaut.views.turbo.TurboView

@Controller("/scroll")
class ScrollController {

    @Get
    @View("scroll")
    @TurboView("scroll")
    @Consumes(MediaType.TEXT_HTML)
    @Produces(MediaType.TEXT_HTML)
    fun index() = ViewModel("Restoring Your Scroll")
}