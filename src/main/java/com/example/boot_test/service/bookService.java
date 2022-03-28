package com.example.boot_test.service;

import com.example.boot_test.dao.BookDao;
import com.example.boot_test.pojo.BOOK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bookService {
    @Autowired
    public BookDao bookdao;
    public Integer bookm(BOOK book)
    {
        return bookdao.bookm ( book );
    }
}
