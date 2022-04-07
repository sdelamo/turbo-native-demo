package io.micronaut.turbo.advanced

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.turbo.model.ViewModel
import io.micronaut.views.View

@Controller("/redirected")
class RedirectedController {

    @View("redirected")
    @Get(produces = [MediaType.TEXT_HTML], consumes = [MediaType.TEXT_HTML])
    fun index() = ViewModel("Redirected Page")

}