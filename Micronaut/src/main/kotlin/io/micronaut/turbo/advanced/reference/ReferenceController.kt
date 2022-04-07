package io.micronaut.turbo.advanced.reference

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.turbo.model.ViewModel
import io.micronaut.views.View

@Controller("/reference")
class ReferenceController {

    @View("reference")
    @Get(produces = [MediaType.TEXT_HTML], consumes = [MediaType.TEXT_HTML])
    fun index() = ViewModel("Reference", pageClass = "index")

    @View("turbo-drive")
    @Get(value = "/turbo-drive", produces = [MediaType.TEXT_HTML], consumes = [MediaType.TEXT_HTML])
    fun turboDrive() = ViewModel("Turbo Drive")

    @View("turbo-frames")
    @Get(value = "/turbo-frames", produces = [MediaType.TEXT_HTML], consumes = [MediaType.TEXT_HTML])
    fun turboFrames() = ViewModel("Turbo Frames")

    @View("turbo-streams")
    @Get(value = "/turbo-streams", produces = [MediaType.TEXT_HTML], consumes = [MediaType.TEXT_HTML])
    fun turboStreams() = ViewModel("Turbo Streams")

    @View("turbo-native")
    @Get(value = "/turbo-native", produces = [MediaType.TEXT_HTML], consumes = [MediaType.TEXT_HTML])
    fun turboNative() = ViewModel("Turbo Native")
}