package com.tiffany.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	
    @RequestMapping("/")
    public String index(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		if (count == null) {
			session.setAttribute("count", 0);
		} else {
			count++;
			session.setAttribute("count", count);
		}
        return "index.jsp";
    }
    
    @RequestMapping("/counter")
    public String counter(HttpSession session) {
    	Integer count = (Integer) session.getAttribute("count");
        return "counter.jsp";
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String login(@RequestParam(value="username") String username, @RequestParam(value="password") String password) {
    	return "redirect:/dashboard";
    }
    
}
