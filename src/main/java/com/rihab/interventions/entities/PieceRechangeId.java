package com.rihab.interventions.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor 
@AllArgsConstructor
@Builder
@Embeddable
public class PieceRechangeId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "code_article", referencedColumnName = "codeArticle")
    private Article article;

	
    @ManyToOne
    private Equipement equipement;

    

}
