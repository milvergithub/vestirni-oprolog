%---------------------------con	ropa de vestir---------------------

%vestir la parte del cuerpo
encima(polera,fisico).
encima(camisa,polera).
encima(camisa,fisico).
encima(corbata,camisa).
encima(chaleco,corbata).
encima(traje,chaleco).
encima(chamarra,chaleco).

%vestir la parte del pantalon
encima(calzoncillo,desnudo).
encima(pantalon,calzoncillo).

%vestir los zapatos
encima(medias,descalzo).
encima(zapatos,medias).
encima(zapatos,pantalon).

%desvestir la parte del cuerpo acciones a realizar dependiendo del estado
quitar(polera,polera).
quitar(camisa,camisa).
quitar(corbata,corbata).
quitar(chaleco,chaleco).
quitar(traje,traje).
quitar(chamarra,chamarra).

%desvestir la parte del pantalon
quitar(calzoncillo,calzoncillo).
quitar(pantalon,medias).
quitar(pantalon,descalzo).

%desvestir los zapatos
quitar(medias,medias).
quitar(zapatos,zapatos).


consulta(X,Y):-encima(X,Y).
consultaD(X,Y,Z):-encima(X,Y),encima(X,Z).
devestir(X,Y):-quitar(X,Y).


























