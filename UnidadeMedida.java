public enum UnidadeMedida {
    /* Explicacao do que seria o tipo especial de classe 'enum'
    * enum eh um tipo especial de "classe",
    * ele substitui a declaracao public class.
    * O Java entende que aquele arquivo nao eh para criacao de objetos genericos,
    * mas sim para listar opcoes fixas
    * (DEFINIR CONJUNTOS FIXOS DE CONSTANTES NOMEADAS - 
    * GARANTINDO SEGURANCA DE TIPOS E IMUTABILIDADE).
    */
    
    CELSIUS, // TEMPERATURA
    PORCENTAGEM, // UMIDADE RELATIVA
    PASCAL, // PRESSAO ATMOSFERICA
    METROS_POR_SEGUNDO_AO_QUADRADO, // ACELERACAO
    NEWTONS, // FORCA
    WATTS_POR_METRO_QUADRADO // RADIACAO SOLAR
}
