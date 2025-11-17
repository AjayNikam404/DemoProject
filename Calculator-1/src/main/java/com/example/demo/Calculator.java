package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator 
{
	@GetMapping("calculator/add/{a}/{b}")
	int add(@PathVariable int a,@PathVariable int b)
	{
		return a+b;
	}
	
	@GetMapping("calc/sub/{a}/{b}")
	int sub(@PathVariable int a,@PathVariable int b)
	{
		return a-b;
	}
	
	@GetMapping("calc/mul/{a}/{b}")
	int mul(@PathVariable int a,@PathVariable int b)
	{
		return a*b;
	}
	
	@GetMapping("calc/div/{a}/{b}")
	int div(@PathVariable int a,@PathVariable int b)
	{
		return a+b;
	}
	
	
	@GetMapping("calculator/add/{a}/{b}/{c}")
	int add(@PathVariable int a,@PathVariable int b,@PathVariable int c)
	{
		return a+b+c;
	}


	@GetMapping("calculator/add/{a}/{b}/{c}/{d}")
	int add(@PathVariable int a,@PathVariable int b,@PathVariable int c,@PathVariable int d)
	{
		return a+b+c+d;
	}

}
