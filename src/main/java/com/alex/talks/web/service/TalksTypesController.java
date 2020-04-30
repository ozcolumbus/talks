package com.alex.talks.web.service;

import com.alex.talks.data.entity.TalkTypes;
import com.alex.talks.data.repositories.TalkTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class TalksTypesController {
@Autowired
private TalkTypesRepository repository;

    @RequestMapping(value="/talktypes", method= RequestMethod.GET)
    public List<TalkTypes> talktypes(@Param("id") Long id){
        List<TalkTypes> talkTypes = new ArrayList<>();
        if (id==null){
            Iterable<TalkTypes> results =this.repository.findAll();
            results.forEach(ttype ->talkTypes.add(ttype));
        }
        else {
            Iterable<TalkTypes> results =toIterable(this.repository.findById(id));
            results.forEach(ttype ->talkTypes.add(ttype));
        }

        return talkTypes;
    }

    public static <T> Iterable<T> toIterable(Optional<T> o) {
        return o.map(Collections::singleton)
                .orElseGet(Collections::emptySet);
    }

}
