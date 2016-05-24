package spring.mvc.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import spring.mvc.beans.Book;

public class ListBooksController extends AbstractController{

	private List<Book> books;
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		return new ModelAndView("listBooks","books",books);
		
	}

	public List<Book> getBooks(){
		return books;
	}
	
	public void setBooks(List<Book> books){
		this.books = books;
	}
}
