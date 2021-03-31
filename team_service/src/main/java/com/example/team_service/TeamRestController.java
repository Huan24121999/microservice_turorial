package com.example.team_service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TeamRestController {

    @RequestMapping(value = "list", method = RequestMethod.GET, produces = "application/json")
    public List<Team> getAll() {

        List<Team> teams = Arrays.asList(
                new Team(1, "Team 1"),
                new Team(2, "Team 2"),
                new Team(3, "Team 3"));

        return teams;

    }
}
