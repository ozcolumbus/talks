package com.alex.talks.web.service;

import com.alex.talks.business.domain.GettingTalks;
import com.alex.talks.business.service.GettingTalksService;
import com.alex.talks.data.entity.TalkTypes;
import com.alex.talks.data.entity.Talks;
import com.alex.talks.data.repositories.TalksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TalksController {
    @Autowired
    private GettingTalksService gettingTalksService;

    @RequestMapping(value = "/talks",method= RequestMethod.GET)
    private List<GettingTalks> getAllTalks(@Param("id") Long id){
        return this.gettingTalksService.GettingTalksById(id);

    }

}
