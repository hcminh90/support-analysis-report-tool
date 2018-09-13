package support.analysis.interceptor;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class TraceInterceptor implements HandlerInterceptor {
	
	private static final Logger logger = Logger.getLogger(TraceInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("Called before handler method");
		logger.info("user-IP : "+ request.getRemoteAddr());
		logger.info("user-HostName : "+ request.getRemoteHost());
		logger.info("user-agent : "+ request.getHeader("user-agent"));
		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String key = (String) headerNames.nextElement();
			String value = request.getHeader(key);
			logger.info(key + ": "+ value);
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("Called after handler method request completion,"
	            + " before rendering the view");
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("Called after rendering the view");
		
	}

}
