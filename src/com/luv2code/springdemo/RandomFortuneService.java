package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The jorney is the reward"
	};
	
	private Random myRandome = new Random();

	@Override
	public String getFortune() {
		int index = myRandome.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
