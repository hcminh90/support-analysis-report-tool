package support.analysis.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

public class PerformanceInterceptor implements MethodInterceptor {
	private static final Logger logger = Logger.getLogger(PerformanceInterceptor.class);

	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		Object result = null;
		long startTime = System.currentTimeMillis();
		try {
			result = method.proceed();

		} finally {
			long endTime = System.currentTimeMillis();
			long executionTime = endTime - startTime;
			logger.info("Method Name: " + method.getMethod().getName() + " - Execution Time: " + executionTime + " ms");
		}
		return result;
	}

}
