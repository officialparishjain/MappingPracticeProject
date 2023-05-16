package com.parishjain.MappingsProject.service;

import com.parishjain.MappingsProject.models.Book;
import com.parishjain.MappingsProject.models.Student;
import com.parishjain.MappingsProject.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    IBookRepo bookRepo;

    @Autowired
    StudentService studentService;
    public void addBook(Book book) {
        Long stdId = book.getBookStudent().getStudentID();
        Student student = studentService.getStudentById(stdId);
        book.setBookStudent(student);
        bookRepo.save(book);
    }


    public List<Book> getAllBookList() {
        return bookRepo.findAll();
    }

    public void deleteBookById(Long id) {
       bookRepo.deleteById(id);
    }
}
