// Importa las clases a testear
const { Concert, Exposicio, Conferencia, Usuari, Agenda } = require('./ex3'); 

console.log("== Test ex3.js ==");

let concert = new Concert("Rock Fest", "2024-08-15", "Barcelona", "Metallica", 120);
let expo = new Exposicio("Art Modern", "2024-09-01", "MACBA", "Cubisme", 42);
let conf = new Conferencia("Tecnologia i Futur", "2024-10-10", "Fira BCN", "Dr. Ada", "professional");

console.log(concert.resum());
console.log(expo.resum());
console.log(conf.resum());

let usuari = new Usuari("Marta", "marta@example.com");
usuari.inscriureA(concert);
usuari.inscriureA(conf);
console.log("Inscripcions:");
console.log(usuari.mostrarInscripcions());

let agenda = new Agenda();
agenda.afegirEsdeveniment(concert);
agenda.afegirEsdeveniment(expo);
agenda.afegirEsdeveniment(conf);

console.log("Tots els esdeveniments:");
console.log(agenda.mostrarTots());

console.log("Filtrant només conferències:");
console.log(agenda.filtrarPerTipus(Conferencia));


/* Aquest joc de proves ha de mostrar per consola el següent:

== Test ex3.js ==
Concert de Metallica, durada: 120min
Exposició sobre Cubisme amb 42 obres
Conferència de Dr. Ada per a públic professional
Inscripcions:
[
  'Concert de Metallica, durada: 120min',
  'Conferència de Dr. Ada per a públic professional'
]
Tots els esdeveniments:
[
  'Rock Fest - 2024-08-15 a Barcelona',
  'Art Modern - 2024-09-01 a MACBA',
  'Tecnologia i Futur - 2024-10-10 a Fira BCN'
]
Filtrant només conferències:
[ 'Conferència de Dr. Ada per a públic professional' ] */