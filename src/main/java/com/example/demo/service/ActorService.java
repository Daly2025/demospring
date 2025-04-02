package com.example.demo.service;

import com.example.demo.model.Actor;
import com.example.demo.repository.ActorRepository;
import com.example.demo.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {


    private ActorRepository actorRepository;
    private FilmRepository filmRepository;

    @Autowired
    public ActorService(ActorRepository actorRepository , FilmRepository filmRepository) {
        this.actorRepository = actorRepository;
    }

    public List<Actor> findAll() {
        return actorRepository.findAll();

    }

    public void save(Actor actor) {
        actorRepository.save(actor);
    }
}
