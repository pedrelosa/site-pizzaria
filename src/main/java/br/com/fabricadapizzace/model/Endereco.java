package br.com.fabricadapizzace.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Endereco")
@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;
    @Getter
    @Setter
    @NotNull
    @OneToOne
    private Logradouro logradouro;
    @Getter
    @Setter
    @NotNull
    private TipoLogradouro tipoLogradouro;
    @Getter
    @Setter
    @NotNull
    private String numeroLogradouro;
    @Getter
    @Setter
    @NotNull
    private String complementoLogradouro;
    @Getter
    @Setter
    @NotNull
    @OneToOne
    private Bairro bairro;
    @Getter
    @Setter
    private String cep;
    @Getter
    @Setter
    @NotNull
    private String referencia;
    @Getter
    @Setter
    @NotNull
    private Double taxaEntrega;
    @Getter
    @Setter
    @ManyToMany
    private List<Cliente> clientes;


    public Endereco() {

    }
}
