package org.dxctraining.service;
import java.util.*;
import org.dxctraining.entities.*;

public interface ILibraryService {
	Book findBookbyId(String id);
	List<Book>displayAll();
	void addBook(Book book);
	Book updateBookcost(String id,double cost);
	void removeBook(String id);

}
