package com.alex.talks.business.service;

import com.alex.talks.business.domain.GettingTalks;
import com.alex.talks.data.entity.TalkTypes;
import com.alex.talks.data.entity.Talks;
import com.alex.talks.data.repositories.TalkTypesRepository;
import com.alex.talks.data.repositories.TalksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class GettingTalksService {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    private final TalksRepository talksRepository;
    private final TalkTypesRepository talkTypesRepository;

    @Autowired
    public GettingTalksService(TalksRepository talksRepository,TalkTypesRepository talkTypesRepository){
        this.talksRepository = talksRepository;
        this.talkTypesRepository = talkTypesRepository;
    }

public List<GettingTalks> GettingTalksById(Long Id) {
    Iterable<Talks> talks;
    if (Id!=null) {
     talks = this.talksRepository.findAllById(Id);}
    else{
        talks = this.talksRepository.findAll();
    }
    Map<Long, GettingTalks> gettingTalksMap = new HashMap<>();
    talks.forEach(gettalks -> {
                GettingTalks gettingTalks = new GettingTalks();
                gettingTalks.setTalksid(gettalks.getId());
                gettingTalks.setName(gettalks.getName());
                gettingTalks.setDescription(gettalks.getDescription());
                gettingTalks.setPresenterName(gettalks.getPresenter_name());
                Optional<TalkTypes> talkTypesResponse = this.talkTypesRepository.findById(gettalks.getTalkTypesId());
                if (talkTypesResponse.isPresent()) {
                    TalkTypes talkTypes = talkTypesResponse.get();
                    gettingTalks.setTalkType(talkTypes.getTalk_type_name());
                }
                gettingTalksMap.put(gettalks.getId(), gettingTalks);
            }
    );
    List<GettingTalks> gettingTalks = new ArrayList<>();
    for (Long talksId : gettingTalksMap.keySet()) {
        gettingTalks.add(gettingTalksMap.get(talksId));
    }
    return gettingTalks;
}

}
