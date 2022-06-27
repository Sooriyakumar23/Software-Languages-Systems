package com.sooriya.web.dao;

import com.sooriya.web.model.Actor;

public class ActorDao {
	public Actor getActor(int aid) {
		
		Actor a = new Actor();
		a.setAid(1000);
		a.setFirstName("Sooriya");
		a.setLastName("Kumar");
		
		return a;
	}
}
