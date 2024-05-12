import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
class GetController {

    @GetMapping("/greet")
    fun greet(@RequestParam(name = "name") name: String): Message {
        return Message("Hello, $name!")
    }
}

data class Message(val message: String)
