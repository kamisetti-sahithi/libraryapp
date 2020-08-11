package org.dxctraining.dao;

import java.util.*;

import org.dxctraining.entities.Book;


public interface ILibraryDao {
	Book findBookbyId(String id);
	List<Book>displayAll();
	void addBook(Book book);
	Book updateBookCost(String id,double cost);
	void removeBook(String id);
	

}
