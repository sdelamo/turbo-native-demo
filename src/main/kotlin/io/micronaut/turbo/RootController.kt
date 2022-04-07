package io.micronaut.turbo

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.turbo.model.ViewModel
import io.micronaut.views.View
import java.security.Principal

@Controller
class RootController {

    @View("index")
    @Get(produces = [MediaType.TEXT_HTML], consumes = [MediaType.TEXT_HTML])
    fun index(principal: Principal?) = ViewModel("Turbo Native Demo", pageClass = "index", principal = principal)
}