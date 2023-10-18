# 📲 POO Desafio: Diagramação UML De Classes Do iPhone

## ✒️ Descrição

Este projeto abrange a modelagem UML de classes, utilizando como modelo o iPhone e suas funcionalidades. O Objetivo é criar através de classes e interfaces um conceito descritivo
de como se comporta internamente o modelo de software que o dispositivo tem como padrão.

Neste repositório também estão contidas na pasta  ``` /src ``` as classes e interfaces ``` .java ``` que representam de maneira abstrata o modelo funcional do iPhone.

## 📋 Diagrama UML

![ UML Img](https://github.com/felipeborges-pgr/diagramacao-iphone-classes/blob/main/docs/diagramacao-uml-classe-iphone.png)


A próxima seção explica sobre as classes e interfaces apresentadas no diagrama que este projeto está baseado. As implementações descrevem de forma breve como funcionaria
um modelo de software interno.

### ``` Reprodutor Musical ```
A interface ``` ReprodutorMusical ``` apresenta os seguintes métodos para implementação: ``` tocar() ```, ``` pausar() ```, ``` selecionarMusica() ```. A responsabilidade
desses métodos é provê funcionalidades para manipulação dos arquivos de áudio.

### ``` Aparelho Telefônico ```
A interface ``` AparelhoTelefonico ``` apresenta os seguintes métodos para implementação: ``` ligar() ```, ``` atender() ```, ``` iniciarCorreioVoz() ```. Estes métodos são
responsáveis por implementar caracteríscas funcionais de um telefone.

### ``` Navegador na Internet ```
A interface ``` NavegadorInternet ``` apresenta os seguintes métodos para implementação: ``` exibirPagina() ```, ``` adicionarNovaAba() ```, ``` atualizarPagina() ```. Estes 
métodos representam o modelo de navegação referente a Web.

### ``` Iphone ```
A classe ``` Iphone ``` implementa todas as interfaces presentes e provê características e funcionalidades específicas para cada um de seus métodos.







