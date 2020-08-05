package util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

public class ProgramUtil {

		private static ProgramUtil instance;
		
		public static synchronized ProgramUtil getInstance() {
			if(instance == null) {
				instance = new ProgramUtil();
			}
			return instance;
		}
		public void addMessage(String text) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, text, null);
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
		public void executeOnContext(String textToExecute) {
			RequestContext context = RequestContext.getCurrentInstance();
			context.execute(textToExecute);
		}
}
