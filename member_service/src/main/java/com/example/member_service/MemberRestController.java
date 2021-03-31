package com.example.member_service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MemberRestController {
    @RequestMapping(value = "list", method = RequestMethod.GET, produces = "application/json")

    public List<Member> getMembers() {

        List<Member> members = Arrays.asList(

                new Member(1, "Nguyen Van A "),

                new Member(2, "Nguyen Van B "),

                new Member(3, "Nguyen Van C "));

        return members;

    }
}
