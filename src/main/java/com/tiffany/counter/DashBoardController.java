package com.tiffany.counter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class DashBoardController {
	@RequestMapping("/dashboard")
	public String dashboard() {
		return "dashboard.jsp";
	}
	
	@RequestMapping("/createError")
    public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "A test error!");
        return "redirect:/dashboard";
    }
}
