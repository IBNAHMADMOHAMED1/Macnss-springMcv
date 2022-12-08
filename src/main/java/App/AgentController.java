package App;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import ma.macnss.services.agent.AgentService;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@Controller
@AllArgsConstructor
public class AgentController {
    AgentService service;

    @RequestMapping("/Agent/Login")
    public String getAgentController(){
        return "agentLogin";
    }

    @PostMapping(path = "/test",produces = "application/json")
    @ResponseBody
    public ResponseEntity test(@RequestBody String name) throws ParseException {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(name);
        System.out.println("--------------------------------------------------------------");
        System.out.println(jsonObject.get("email"));
        return ResponseEntity.ok(name);
    }

    @PostMapping(path = "/Agent/GET_PASSWORD")
    public ResponseEntity getPassword(@RequestBody String email) throws ParseException {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(email);

        if(!service.checkAgent((String) jsonObject.get("email"))){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"message\":\"Il y a pas un agent avec cet email\"}");
        }
        int num = (int) ((Math.random() * (9999 - 1111)) + 1111);
        return ResponseEntity.ok("{\"message\":\"Votre mot de passe a été envoyé\"}");
    }

    @PostMapping(path = "/fr/agent")
    public String agentLogin(@RequestParam Map<String,String> allRequests, HttpServletRequest request){
        Boolean result = service.login(allRequests.get("email"),allRequests.get("password"),request);
        if(!result) return "agentLogin";
        return "agent";
    }


    @PostMapping(path="/add_dossier")
    public String addDossier(){
        return null;
    }

}
