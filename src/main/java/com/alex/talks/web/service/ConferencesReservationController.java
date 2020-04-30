package com.alex.talks.web.service;

import com.alex.talks.business.domain.ConferencesReservation;
import com.alex.talks.business.service.ConferencesReservationService;
import com.alex.talks.data.entity.Conferences;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ConferencesReservationController {

    @Autowired
    private ConferencesReservationService conferencesReservationService;

    @RequestMapping(value="/conferences",method = RequestMethod.GET)
    private List<ConferencesReservation> getReservations(){

        return this.conferencesReservationService.GetConferencesList();
    }

@RequestMapping(value="/conferences",method=RequestMethod.POST, consumes = "application/json")
    private Conferences newConference (@RequestBody ConferencesReservation newConf){


    return this.conferencesReservationService.saveConference(newConf);
    }

}
