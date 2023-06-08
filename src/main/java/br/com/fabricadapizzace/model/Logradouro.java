package br.com.fabricadapizzace.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Logradouro")
@EqualsAndHashCode
@AllArgsConstructor
public class Logradouro {
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
    private AbreviacaoLogradouro abreviacaoLogradouro;
    @Getter
    @Setter
    @NotNull
    private TipoLogradouro tipoLogradouro;

    @Getter
    @Setter
    @NotNull
    @ManyToOne
    private Bairro bairro;

    public Logradouro() {

    }
}
