package today;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class  Test {
    @RequestMapping("/test1.form")
    public String test1(Model model,String test){
        return "show";
    }

}
