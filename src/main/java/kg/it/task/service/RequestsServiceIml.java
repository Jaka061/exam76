package kg.it.task.service;

import kg.it.task.entity.Requests;
import kg.it.task.repository.RequestsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RequestsServiceIml implements RequestsService {
    @Autowired
    private RequestsRepository requestsRepository;

    @Override
    public Requests create(Requests requests) {
        return requestsRepository.save(requests);
    }

    @Override
    public List<Requests> getAll() {
        return requestsRepository.findAll();
    }
}
