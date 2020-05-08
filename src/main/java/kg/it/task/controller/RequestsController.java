package kg.it.task.controller;

import kg.it.task.entity.Requests;
import kg.it.task.model.Cinema;
import kg.it.task.model.Restaurants;
import kg.it.task.model.Ticket;
import kg.it.task.service.RequestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/book")
public class RequestsController {
    @Autowired
    private RequestsService requestsService;

    @PostMapping
    public Requests create (Requests requests){
        return requestsService.create(requests);
    }

    @GetMapping
    public List<Requests> getAll(){
        return requestsService.getAll();
    }

    @GetMapping("/R")
    public Restaurants getRestaurant(){
        Requests requests = new Requests();
        requests.setTime(LocalDateTime.now());
        requests.setCode("R");
        requestsService.create(requests);
        return new  Restaurants("Navat","address","Plov","site");
    }
    @GetMapping("/C")
    public Cinema getCinema(){
        Requests requests = new Requests();
        requests.setTime(LocalDateTime.now());
        requests.setCode("C");
        requestsService.create(requests);
        return new Cinema("Broadway",1700,"address","site");
    }
    @GetMapping("/T")
    public Ticket getTicket(){
        Requests requests = new Requests();
        requests.setTime(LocalDateTime.now());
        requests.setCode("T");
        requestsService.create(requests);
        return new Ticket(" Ticketon","site","balance.kg");
    }
}
