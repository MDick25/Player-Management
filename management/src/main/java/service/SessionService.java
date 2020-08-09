package service;

import javax.ejb.Stateless;

import entity.Session;

@Stateless
public class SessionService extends TemplateService<Session> {
	
	public SessionService() {
		super(Session.class);
	}

}
