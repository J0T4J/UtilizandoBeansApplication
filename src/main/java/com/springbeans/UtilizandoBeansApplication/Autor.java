package com.springbeans.UtilizandoBeansApplication;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Autor extends AutorLivro {

    private String nome;

    public void exibirAutor(){
        System.out.println(this.nome);
    }

}
