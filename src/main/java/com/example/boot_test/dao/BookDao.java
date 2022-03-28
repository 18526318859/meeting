package com.example.boot_test.dao;

import com.example.boot_test.pojo.BOOK;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BookDao {
    public Integer bookm(BOOK book);
}
