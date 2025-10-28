package VictorCode.langchain4j;

import dev.langchain4j.service.Result;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://locaai-frontend-production.up.railway.app")
@RestController
@RequestMapping("/api/assistant")
public class AssistantController {

    private final AssistantAIService assistantAIService;


    public AssistantController(AssistantAIService assistantAIService) {
        this.assistantAIService = assistantAIService;
    }


    @PostMapping()
    public String PerguntarAssistante(@RequestBody String userMessage){
        Result<String> result = assistantAIService.handleRequest(userMessage);
        return result.content();
    }


}
