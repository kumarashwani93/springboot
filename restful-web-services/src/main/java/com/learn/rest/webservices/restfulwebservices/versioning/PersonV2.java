package com.learn.rest.webservices.restfulwebservices.versioning;

public class PersonV2 {
	
	private Name name;

	public final Name getName() {
		return name;
	}

	public final void setName(Name name) {
		this.name = name;
	}

	public PersonV2(Name name) {
		super();
		this.name = name;
	}
	
}
