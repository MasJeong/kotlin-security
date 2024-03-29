package jihun.kotlin.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {

    @GetMapping("/")
    fun hello(model: Model): String {
        model["data"] = "hello data"
        return "hello"
    }
}