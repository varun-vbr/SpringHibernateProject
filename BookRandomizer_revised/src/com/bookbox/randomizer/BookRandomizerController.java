package com.bookbox.randomizer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/randomizer")
public class BookRandomizerController {
	@Autowired
	private BookRandomizerService service;
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Book>> getBookList(){
		return new ResponseEntity<List<Book>>(service.getRandomBooks(),HttpStatus.OK);
	}

}
