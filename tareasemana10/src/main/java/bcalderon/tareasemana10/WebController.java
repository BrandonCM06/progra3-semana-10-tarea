package bcalderon.tareasemana10;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/inicio")
    public String inicio(Model model) {
        model.addAttribute("título", "Programación III");
        model.addAttribute("subtítulo", "Tarea Semana 10");
        model.addAttribute("contenido", "Brandon Calderón");

        return "inicio";
    }
}
