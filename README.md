# parking-control

Projeto de uma API realizado para fins de estudo.

A API é usada para controle de estacionamento de condomínios.

Realizado acompanhando uma vídeoaula do canal Michelli Brito no Youtube (<a href="https://www.youtube.com/watch?v=LXRU-Z36GEU">Link</a>).

## Tecnologias usadas

* Java
* Spring Boot
* MySQL

## Requisições

<table>
  <tr>
    <td>/parking-spot</td><td>POST</td><td>Realiza o cadastro de uma vaga.</td>
  </tr>
  <tr>
    <td>/parking-spot</td><td>GET</td><td>Recupera todas as vagas cadastradas.</td>
  </tr>
  <tr>
    <td>/parking-spot/{id}</td><td>GET</td><td>Recupera uma vaga específica.</td>
  </tr>
  <tr>
    <td>/parking-spot/{id}</td><td>DELETE</td><td>Deleta o cadastro de uma vaga específica.</td>
  </tr>
  <tr>
    <td>/parking-spot/{id}</td><td>PUT</td><td>Atualiza o cadastro de uma vaga.</td>
  </tr>
</table>
