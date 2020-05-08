package kg.it.task.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cinema {
    private String name;
    private Integer capacity;
    private String address;
    private String site;


}
