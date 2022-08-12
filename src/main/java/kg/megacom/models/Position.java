package kg.megacom.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


import javax.persistence.*;


@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="positions")
        //Из контроля обращаюсь к сервису из сервиса к дао
public class Position
{
    @Id
            @GeneratedValue(strategy= GenerationType.IDENTITY)
            @Column (name="position_id")
            Long id;
    @Column (unique = true,nullable = false,name="position_name",length=100)

    String name;
    boolean active;
}
