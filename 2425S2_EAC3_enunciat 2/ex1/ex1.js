// Exercici 1 EAC3

const inventari = {
  jocs: [
    { id: 1, titol: "Zelda: Breath of the Wild", plataforma: "Nintendo Switch", estoc: 3 },
    { id: 2, titol: "God of War", plataforma: "PlayStation 4", estoc: 5 }
  ],
  // Afegeix aquí el teu codi



/*Implementeu les funcions següents:

    • afegirJoc(titol, plataforma, estoc): afegeix un nou videojoc i retorna 
    l'id assignat (números consecutius). No es poden repetir títols i plataforma, 
    és a dir, seguint amb l’exemple, sí que pot existir un altre "Zelda: Breath 
    of the Wild" però no per Nintendo Switch, sinó per Play Station, Xbox, etc.
    • actualitzarEstoc(id, nouEstoc): actualitza l'estoc del joc indicat. Retorna 
    true si té èxit, false si l'id no existeix.
    • filtrarPerPlataforma(plataforma): retorna un array amb tots els jocs d'aquella 
    plataforma.
    • llistarDisponibles(): retorna els jocs amb estoc superior a 0.
    • jocAmbMesEstoc(): retorna l'objecte joc amb més estoc. Si n'hi ha més d'un, 
    els retorna tots.

Tot allò que no s’ha especificat en aquest enunciat podeu implementar-ho com cregueu més oportú. L’únic requisit és que es pugui desenvolupar el joc de proves i per pantalla surtin les respostes esperades que ja estan indicades en els comentaris subministrats.
*/
};
  function actualitzarEstoc(id, nouEstoc){
    jocs.forEach(joc => {
      if(joc.id === id){return false}
  });
}
function afegirJoc(titol, plataforma, estoc){
  let new_joc = {titol, plataforma, estoc};
  let new_id = inventari[inventari.length].id + 1;
  inventari.pop(new_joc);
  return new_id;
};

function filtrarPerPlataforma(plataforma){
let llistaByPlataforma = [];
for(let joc in inventari){
  if(joc.plataforma === plataforma){
    llistaByPlataforma.push(joc)
  }
}
};
function jocAmbMesEstoc(){
  if(this.jocs.length === 0) return [];
  
}

// No canviïs aquesta línia de codi. Serveix perquè les funcions d'aquest fitxer es puguin usar en el fitxer de tests.
module.exports = { inventari };