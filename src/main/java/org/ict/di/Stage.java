package org.ict.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Stage {
	
	@Autowired
	private Singer singer1;
	
	public Stage(Singer singer) {
		this.singer1  =singer ;
	}
	
	public void perform() {
		System.out.print("무대에 섭니다. ");
		singer1.sing();
	}
}



