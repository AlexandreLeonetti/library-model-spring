package com.example.springLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {

    @Autowired
    private LibraryService libraryService;

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(String... args) {
        libraryService.addBook("1984", "George Orwell");
        libraryService.addBook("To Kill a Mockingbird", "Harper Lee");

        libraryService.listBooks();
    }
}
