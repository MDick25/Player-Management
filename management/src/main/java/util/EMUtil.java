package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {

		private static EMUtil instance;
		private final EntityManagerFactory factory;
		
		public static synchronized EMUtil getInstance() {
			if(instance == null) {
				instance = new EMUtil();
				
				
			}
			return instance;
			
		}
		
		private EMUtil() {
			this.factory = Persistence.createEntityManagerFactory("Program");
			
		}
		public EntityManager createManager() {
			return factory.createEntityManager();
		}
		
		
}
