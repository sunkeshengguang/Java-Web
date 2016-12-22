package com.simpleTag;

import java.io.IOException;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
/**
 * class SimpleTag 
 * @author 
 */
public class SimpleTag extends SimpleTagSupport{
	private String error_message;

	public void doTag() throws JspException, IOException {
		getJspContext().getOut().write(error_message);

	}
	
	public void setError_message(String errorMessage) {
		error_message = errorMessage;
	}
}
