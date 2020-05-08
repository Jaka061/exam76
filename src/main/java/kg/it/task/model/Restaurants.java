package kg.it.task.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurants {
    private String name;
    private String address;
    private String specialDishes;
    private String site;

}
