package br.com.fabricadapizzace.model;


import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cliente")
@EqualsAndHashCode
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;
    @Getter
    @Setter
    @NotNull
    private String telefone;
    @Getter
    @Setter
    @NotNull
    private String nome;
    @Getter
    @Setter
    private String nomeCompleto;
    @Getter
    @Setter
    @NotNull
    @ManyToMany
    private List<Endereco> enderecos;
    @Getter
    @Setter
    private Double taxaEntrega;
    @Getter
    @Setter
    private String observacoes;

    public Cliente() {

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", telefone='" + telefone + '\'' +
                ", nome='" + nome + '\'' +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", enderecos=" + enderecos +
                ", taxaEntrega=" + taxaEntrega +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }
}
