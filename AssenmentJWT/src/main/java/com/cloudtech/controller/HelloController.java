package com.cloudtech.controller;

import com.cloudtech.model.Book;
import com.cloudtech.model.Pen;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

//
//	@Autowired
//	private CommonService commonService;

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World Assenment JWT Tech Cloud";
	}


	// Book Controller
	@GetMapping("/getBook")
	public Book getBook() {
		return new Book(1, "JKava Basic");
	}

	@GetMapping(value = "/getAllBook")
	public List<Book> getAllBook()
	{
//finds all the books
//		List<Book> books = commonService.findAllBook();

//creating an object of ArrayList
		ArrayList<Book> books = new ArrayList<Book>();
//adding books to the List
		books.add(new Book(100, "Java 1"));
		books.add(new Book(101, "Java 2"));
		books.add(new Book(102, "Java 3"));
		books.add(new Book(103, "Java 4"));
		books.add(new Book(104, "Java 5"));
		books.add(new Book(105, "Java 5"));
//returns the book list
		return books;
	}

	// Pen Controller
	@GetMapping("/getPen")
	public Pen getPen() {
		return new Pen(1, "JKava Basic");
	}

	@GetMapping(value = "/getAllPen")
	public List<Pen> getAllPen()
	{
//finds all the pens

//creating an object of ArrayList
		ArrayList<Pen> pens = new ArrayList<Pen>();
//adding products to the List
		pens.add(new Pen(100, "Pen 1"));
		pens.add(new Pen(101, "Pen 2"));
		pens.add(new Pen(102, "Pen 3"));
		pens.add(new Pen(103, "Pen 4"));
		pens.add(new Pen(104, "Pen 5"));
		pens.add(new Pen(105, "Pen 5"));
//returns the pens list
		return pens;
	}

	// Get  Book
	@GetMapping(value = "/get")
	public String get()
	{
		//returns the Book
		return "Book";
	}

	// Get All Book & Pen
	@GetMapping(value = "/getAll")
	public List getAll()
	{

		List itemList = new ArrayList();

		itemList.add("Book");
		itemList.add("Pen");

//returns the All list
		return itemList;
	}


}
