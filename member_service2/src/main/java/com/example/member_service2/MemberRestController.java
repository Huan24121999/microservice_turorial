package com.example.member_service2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MemberRestController {
    @RequestMapping(value = "list", method = RequestMethod.GET, produces = "application/json")
    public List<Member> getAll() {

        List<Member> members = Arrays.asList(
                new Member(1, "Member 1"),
                new Member(1, "Member 2"),
                new Member(1, "Member 3"));

        return members;

    }
}
