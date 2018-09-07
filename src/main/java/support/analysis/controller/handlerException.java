package support.analysis.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class handlerException {
	private static final Logger logger = Logger.getLogger(handlerException.class);

	@ExceptionHandler(Exception.class)
	@RequestMapping(value = "errors", method = RequestMethod.GET)
	public ModelAndView handleError(HttpServletRequest req, Exception ex) {
		String errorMsg = "";
		Integer statusCode = (Integer) req.getAttribute("javax.servlet.error.status_code");
		Throwable throwable = (Throwable) req.getAttribute("javax.servlet.error.exception");
		logger.error("Request: " + req.getRequestURL() + " raised " + ex);
		logger.error(ex);
		logger.trace("", throwable);

		/*
		 * StackTraceElement[] trace = ex.getStackTrace(); for (StackTraceElement
		 * traceElement : trace) logger.error("\tat " + traceElement);
		 */

		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", ex);
		mav.addObject("url", req.getRequestURL());
		
		switch (statusCode) {
		case 400: {
			errorMsg = "Http Error Code: 400. Bad Request";
			break;
		}
		case 401: {
			errorMsg = "Http Error Code: 401. Unauthorized";
			break;
		}
		case 402: {
			errorMsg = "Http Error Code: 402 Payment Required";
			break;
		}
		case 403: {
			errorMsg = "Http Error Code: 403 Forbidden";
			break;
		}
		case 404: {
			errorMsg = "Http Error Code: 404. Resource not found";
			break;
		}
		case 405: {
			errorMsg = "Http Error Code: 405 Method Not Allowed";
			break;
		}
		case 406: {
			errorMsg = "Http Error Code: 406 Not Acceptable";
			break;
		}
		case 408: {
			errorMsg = "Http Error Code: 408 Request Timeout";
			break;
		}
		case 500: {
			errorMsg = "Http Error Code: 500. Internal Server Error";
			break;
		}
		case 502: {
			errorMsg = "Http Error Code: 502 Bad Gateway";
			break;
		}
		case 503: {
			errorMsg = "Http Error Code: 503 Service Unavailable";
			break;
		}
		case 504: {
			errorMsg = "Http Error Code: 504 Gateway Timeout";
			break;
		}
		default :
			errorMsg="Http Error Code " + statusCode + " Unknown exception!";
		}
		mav.addObject("errorMsg", errorMsg);
		mav.setViewName("errors");
		return mav;
	}
}
