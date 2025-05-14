package br.com.alurafood.pagamentos.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Configuracao {
    /*
        Para evitar erro e o aviso:
        "Action:
        Consider defining a bean of type 'org.modelmapper.ModelMapper' in
        your configuration."
     */
    @Bean
    public ModelMapper obterModelMaooer(){
        return new ModelMapper();
    }
}
