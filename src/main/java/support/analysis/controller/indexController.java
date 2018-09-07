package support.analysis.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
	private static final Logger logger = Logger.getLogger(indexController.class);
	@RequestMapping("/index")
	public String index() {
		logger.info("Access to index()");
		return "index";
	}
}
