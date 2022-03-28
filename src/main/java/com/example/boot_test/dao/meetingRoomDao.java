package com.example.boot_test.dao;

import com.example.boot_test.pojo.MeetingRoom;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface meetingRoomDao {

    List<MeetingRoom> getall();

    Integer addMr(MeetingRoom meetingRoom);
}
