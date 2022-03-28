package com.example.boot_test.dao;

import com.example.boot_test.pojo.MeetingRoom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface meeting {
    MeetingRoom searchBymeetingid(@Param ( "meetingid" )Integer meetingid);
    List<Integer> getAllBymeetingid(@Param ( "meetingid" )Integer meetingid);
    public int join(@Param ( "meetingid" ) Integer meetingid, @Param ( "employeeid" ) Integer employeeid);
}
