package iterator;

import inheritance.ILogger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class FilteringLogger implements ILogger{


	private ILogger logger;
	
	public FilteringLogger(ILogger logger) {
		this.logger = logger;
	}

	@Override
	public void log(String severity, String message, Exception e) {
		if (accept(severity, message, e)) {
			logger.log(severity, message, e);
		}
	}

	protected abstract boolean accept(String severity, String message, Exception e);
	

}
