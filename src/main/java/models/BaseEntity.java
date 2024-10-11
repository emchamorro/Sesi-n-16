package models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity{

    @GeneratedValue( generator = "system-vvid")
    @GenericGenerator( name = "system-vvid", strategy = "vvid")
    @Id
    private String id;

}