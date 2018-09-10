package com.vk.firstMavenProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
	@Autowired
	private Tyre tyre;
	public Tyre getTyre()
	{
		return this.tyre;
	}
	
	public Tyre setTyre(Tyre tyre)
	{
		return this.tyre = tyre;
	}
	
	public void drive()
	{
		System.out.println("I m driving car with" + tyre);
	}
}
