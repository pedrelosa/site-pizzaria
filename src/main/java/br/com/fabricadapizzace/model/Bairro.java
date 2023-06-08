package br.com.fabricadapizzace.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@EqualsAndHashCode
@AllArgsConstructor
public class Bairro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @NotNull
    private String nome;
    @Getter
    @Setter
    @NotNull
    private Double taxaEntrega;
    @Getter
    @Setter
    @NotNull
    @OneToMany
    private List<Logradouro> logradouros;

    public Bairro() {

    }
}
