package com.devsuperior.dsmovie.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_score")
public class Score {

    @EmbeddedId
    private ScorePK scorePK = new ScorePK();
    private BigDecimal value;

    public void setMovie(Movie movie){
        this.scorePK.setMovie(movie);
    }

    public void setUser(User user){
        this.scorePK.setUser(user);
    }
}
