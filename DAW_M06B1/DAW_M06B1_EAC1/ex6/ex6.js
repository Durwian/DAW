/*
EXERCICI 6: Emmagatzematge local: localStorage, sessionStorage i cookies (2 punts)
Amb el layout que trobaràs en l’arxiu ex6.html volem crear una màquina virtual expenedora de refrescos. 
Fixa’t que el disseny ja està muntat i cada botó representa un refresc.
Cada cop que un usuari premi el botó per comprar un refresc es cridarà la funció comprar() i la primera 
acció que farà és mostrar a l’usuari un alert amb una frase a l’estil: «Aquí té la seva llauna de Coca-cola». 
Més enllà d’això haurà de guardar un log (o històric de dades) de tots els refrescos que la màquina ha venut,
on cada entrada tindrà el nom del refresc i la data en la que s’ha venut. Aquest històric el pots gestionar 
com vulguis però tard o d’hora s’haurà de desar al localStorage, ja que no voldrem que es perdi la informació 
quan es tanca el navegador.
Al layout també trobaràs un botó anomenat precisament LOG que crida la funció log() que el que ha de fer és mostrar 
per consola tot l’històric de vendes, llistant el refresc i la data en la que s’ha venut. Al final d’aquest 
històric s’ha de mostrar un resum del nombre de llaunes totals venudes de cada refresc.
Recorda que el localStorage sempre serà accessible (a menys que deliberadament s'esborri), per tant assegura't 
que quan es tanca el navegador, i posteriorment es torna a obrir l'aplicació, l’històric de vendes encara hi és 
present.
Per desenvolupar-ho més còmodament i no barrejar el disseny amb la lògica, escriu el teu codi a l’arxiu ex6.js.
*/

let historicVendes = localStorage.getItem("historicVendes");
// Funció comprar
function comprar(refresc) {
    alert("Aquí té la seva llauna de " + refresc + ".");
    
    let venda = `${refresc} - ${new Date().toLocaleDateString()}`;

    if(historicVendes !== null){
        historicVendes = historicVendes + '\n' + venda;
    }else{
        historicVendes = venda;
    }
    localStorage.setItem("historicVendes", historicVendes);
    console.log(historicVendes);
}


// Funció mostrar log
function log() {
    console.log("Històric de vendes:");
    // Escriu aquí el teu codi
        historicVendes = localStorage.getItem("historicVendes");
        let venda, producte, quantitat;
        let quanitat = 0;
        let productes = [][];
        if(historicVendes === null){
            console.log("No hi ha vendes registrades.");
        }
        let vendes = historicVendes.split("\n");
        console.log(vendes);
        for(venda in vendes){
            producte = vendes[venda].split("-")[0];
            console.log(`Venda n. :${venda}, Producte: ${producte}`);
            productes.addd(producte);
        }
        console.log(productes[producte]);
        console.log(venda);
}
