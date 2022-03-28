package com.example.boot_test.service;

import com.example.boot_test.dao.meetingRoomDao;
import com.example.boot_test.pojo.MeetingRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class meetingRoomService {
    @Autowired
    public meetingRoomDao roomDao;
    public List<MeetingRoom> getall() {
        return roomDao.getall();
    }
    public Integer addMr(MeetingRoom meetingRoom) {
        return roomDao.addMr ( meetingRoom );
    }
}
