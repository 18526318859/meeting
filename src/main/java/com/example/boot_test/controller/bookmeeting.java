package com.example.boot_test.controller;

import com.example.boot_test.pojo.BOOK;
import com.example.boot_test.pojo.MeetingRoom;
import com.example.boot_test.service.bookService;
import com.example.boot_test.service.meetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

@Controller
public class bookmeeting {
    @Autowired
    public meetingRoomService roomService;
    public bookService books;
    @RequestMapping("/book")
    public String tobook(Model model, HttpSession Session){
        List<MeetingRoom> getall = roomService.getall ( );
        model.addAttribute ( "rooms",getall );
        return "meetingroom/bookmeeting";
    }
    @RequestMapping("/bookmeet")
    @ResponseBody
    public int book( BOOK book){

        book.setRoomid ( 5 );
        book.setReservationtime (new Date ());
        System.out.println ( book );
        int re = books.bookm ( book );
        System.out.println ( re );
        return re;
    }


}
