package guru.springframework.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by dmitri on 2020-08-29.
 */
@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;
}
