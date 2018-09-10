package com.vk.firstMavenProject;
import org.springframework.stereotype.Component;

@Component
public class Aeroplane implements Vehicle{
public void drive()
{
	System.out.println("I am flying aeroplane");
}
}
