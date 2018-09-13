package support.analysis.config;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import support.analysis.interceptor.TraceInterceptor;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "support.analysis.controller" })
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	private static final Logger logger = Logger.getLogger(TraceInterceptor.class);
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		logger.info("addResourceHandler : minhhc1");
		//registry.addResourceHandler("/resources/**").addResourceLocations("/resources/").setCachePeriod(0);
	}

}
