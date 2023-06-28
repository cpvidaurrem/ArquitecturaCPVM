<label for="titulo">Titulo</label>
<input type="text" name="titulo" value="{{ $pelicula->titulo}}" id="titulo"> <br>

<label for="artista_principal">artista_principal</label>
<input type="text" name="artista_principal" value="{{ $pelicula->artista_principal}}" id="artista_principal"> <br>

<label for="anio">anio</label>
<input type="text" name="anio" value="{{ $pelicula->anio}}" id="anio"> <br>

<label for="productora">productora</label>
<input type="text" name="productora" value="{{ $pelicula->productora}}" id="productora"> <br>

<label for="genero">genero</label>
<input type="text" name="genero" value="{{ $pelicula->genero}}" id="genero"> <br>



<input type="submit" value="Enviar"> <br>