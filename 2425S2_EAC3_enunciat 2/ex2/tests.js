// Importa les classes a testejar
const { Portatil, Tauleta, Telefon } = require('./ex2'); 

console.log("== Test ex2.js ==");

let portatil = new Portatil("HP", "Pavilion", 2020, 6);
console.log(portatil.mostrarInfo());

let tauleta = new Tauleta("Apple", "iPad Air", 2022, 10.5);
console.log(tauleta.mostrarInfo());

let telefon = new Telefon("Samsung", "Galaxy S22", 2023, true);
console.log(telefon.mostrarInfo());


/* Quan s'executi aquest joc de proves hauria de sortir quelcom semblant a:

== Test ex2.js ==
HP Pavilion, antiguitat: 5 anys, autonomia: 6h
Apple iPad Air, antiguitat: 3 anys, 10.5 polzades
Samsung Galaxy S22, antiguitat: 2 anys, 5G: Sí */
