# Criando Exceções Personalizadas em Java

[![forthebadge made-with-Java](http://ForTheBadge.com/images/badges/made-with-Java.svg)](https://www.java.com/pt-BR/)

<h2> Case: </h2>

Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data de entrada e data de saída) e mostrar os dados da reserva, inclusive sua duração em dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar novamente a reserva com os dados atualizados. O programa não deve aceitar dados inválidos para a reserva, conforme as seguintes regras:
- Alterações de reserva só podem ocorrer para datas futuras
- A data de saída deve ser maior que a data de entrada
______________________
- Atributos: 

private Integer roomNumber;

private Date checkIn;

private Date checkOut;


- Métodos: 

duration () : Integer 

updateDates(checkIn: Date, checkOut: Date): void
