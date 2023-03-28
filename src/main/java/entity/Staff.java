package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
@Scope("prototype")
@Entity(name = "staff")
@Table
public class Staff {

    @Id
    @Column(name = "ID")
    private int staff_id;

}
