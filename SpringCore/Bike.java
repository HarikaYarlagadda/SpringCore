package com.harika.SpringCore;
import org.springframework.stereotype.Component;

@Component

public class Bike implements Vehicle
{
	public void drive() 
	{
	System.out.println("Is running");
    }
}