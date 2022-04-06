package io.micronaut.turbo.basic

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Consumes
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.turbo.model.ViewModel
import io.micronaut.views.View
import io.micronaut.views.turbo.TurboView
import java.util.concurrent.CompletableFuture
import java.util.concurrent.CompletableFuture.delayedExecutor
import java.util.concurrent.TimeUnit

@Controller("/slow")
class SlowController {

    @Get
    @View("slow")
    @TurboView("slow")
    @Consumes(MediaType.TEXT_HTML)
    @Produces(MediaType.TEXT_HTML)
    fun index() = CompletableFuture.supplyAsync(
        { ViewModel("Slow-loading Page") },
        delayedExecutor(3, TimeUnit.SECONDS)
    ).get()
}