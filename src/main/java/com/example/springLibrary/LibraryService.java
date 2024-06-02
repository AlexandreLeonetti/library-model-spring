package com.example.springLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {
    private final Library library;

    @Autowired
    public LibraryService(Library library) {
        this.library = library;
    }

    public void addBook(String title, String author) {
        library.addBook(new Book(title, author));
    }

    public void listBooks() {
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }
    }
}
