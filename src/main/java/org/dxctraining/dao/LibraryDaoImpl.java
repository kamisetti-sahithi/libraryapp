package org.dxctraining.dao;
import java.util.*;

import org.dxctraining.entities.*;
import org.dxctraining.exceptions.BookNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class LibraryDaoImpl implements ILibraryDao {
	private Map<String,Book> store=new HashMap<>();
	private int generatedid;
	public String generatedId() {
		generatedid++;
		String strid=""+generatedid;
		return strid;
	}

	@Override
	public Book findBookbyId(String id) {
		Book book=store.get(id);
		if(book==null) {
			throw new BookNotFoundException("book not found");
			
		}
		
		return book;
	}
	

	@Override
	public List<Book> displayAll() {
		Collection<Book> displaybook=store.values();
		List<Book> list=new ArrayList<>();
		for(Book book:displaybook) {
			list.add(book);
		}
		
		
		return list;
	}

	@Override
	public void addBook(Book book) {
		String id=book.getId();
		store.put(id,book);
		book.setId(id);
		
		
		
	}

	@Override
	public Book updateBookCost(String id, double cost) {
		Book book=findBookbyId(id);
		book.setCost(cost);
		
		return book;
	}

	@Override
	public void removeBook(String id) {
		store.remove(id);
		
	}
	
	

}
