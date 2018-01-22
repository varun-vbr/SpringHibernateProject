package com.bookbox.randomizer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookRandomizerService {
	@Autowired
	private BookRandomizerDao dao;
	
	public List<Book> getRandomBooks(){
		ArrayList<Book> randomBookList=new ArrayList<Book>();
		for(int i=0;i<5;i++){
			int randomNumber=(int)(11.0*Math.random());
			randomBookList.add(dao.getBookFromDB(randomNumber+1));
			}
		return randomBookList;
	}

}
