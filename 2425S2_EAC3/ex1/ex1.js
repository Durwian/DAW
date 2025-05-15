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

	actualitzarEstoc:function(id, nouEstoc){
		for(let joc in this.jocs){
			if(this.jocs[joc].id == id){
				this.jocs[joc].estoc = nouEstoc;
				return true;
		}
		return false;
		};
	},

	afegirJoc: function (titol, plataforma, estoc){
		for(let joc in this.jocs){
			if(this.jocs[joc].titol == titol && this.jocs[joc].plataforma == plataforma){
				return null;		
			}
		let new_id = this.jocs[inventari.jocs.length - 1].id + 1;
		this.jocs.push({new_id, titol, plataforma, estoc});
		return new_id;
		}
	},

	filtrarPerPlataforma: function(plataforma){
	let llistaByPlataforma = [];
	for(let joc in this.jocs){
		if(this.jocs[joc].plataforma === plataforma){
			llistaByPlataforma.push(this.jocs[joc])
		}
	}
	console.log("llista:", llistaByPlataforma);
	return llistaByPlataforma;
	},

	llistarDisponibles:function(){
		let llistatDisponibles = [];
		for(let joc in this.jocs) {
			if(this.jocs[joc].estoc > 0){
				llistatDisponibles.push(inventari.jocs[joc]);
			}
		};
		return llistatDisponibles;
	},

	jocAmbMesEstoc: function(){
		let jocAmbMesEstoc = this.jocs[0];
		for(let joc in this.jocs){
			if(this.jocs[joc].estoc > jocAmbMesEstoc.estoc){
				jocAmbMesEstoc = this.jocs[joc];
			}
		}
		return jocAmbMesEstoc;
	},

};

// No canviïs aquesta línia de codi. Serveix perquè les funcions d'aquest fitxer es puguin usar en el fitxer de tests.
module.exports = { inventari };