package kg.it.task.service;

import kg.it.task.entity.Requests;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface RequestsService {
    Requests create(Requests requests);
    List<Requests> getAll();

}
