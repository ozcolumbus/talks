package com.alex.talks.business.service;

import com.alex.talks.business.domain.ConferencesReservation;
import com.alex.talks.data.entity.Conferences;
import com.alex.talks.data.repositories.ConferencesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ConferencesReservationService {

    @Autowired
    private ConferencesRepository conferencesRepository;

    public List<ConferencesReservation> GetConferencesList (){
     Iterable<Conferences> confs = this.conferencesRepository.findAll();
        Map<Long, ConferencesReservation> ConferencesReservationMap = new HashMap<>();
        confs.forEach(conf->{
         ConferencesReservation confReserv = new ConferencesReservation();
         confReserv.setId(conf.getId());
         confReserv.setName(conf.getName());
         confReserv.setTopic(conf.getTopic());
         confReserv.setPartNum(conf.getPartNum());
         confReserv.setConfDateFrom(conf.getConfDateFrom());
         confReserv.setConfDateTo(conf.getConfDateTo());
         ConferencesReservationMap.put(conf.getId(),confReserv);
     });
        List<ConferencesReservation> confReservations = new ArrayList<>();
        for (Long confId : ConferencesReservationMap.keySet()){
            confReservations.add(ConferencesReservationMap.get(confId));

        }

    return confReservations;}

public Conferences saveConference (ConferencesReservation  newConf){
       Conferences conf= new Conferences();
       conf.setName(newConf.getName());
       conf.setTopic(newConf.getTopic());
       conf.setPartNum(newConf.getPartNum());

       return this.conferencesRepository.save(conf);
}

}
