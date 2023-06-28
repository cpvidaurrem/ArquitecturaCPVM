<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    Mostrar la Lista de empleados
    <table class="table table-light">

        <thead class="thead-light">
            <tr>
                <th>#</th>
                <th>Titulo</th>
                <th>artista</th>
                <th>anio</th>
                <th>productora</th>
                <th>genero</th>
                <th>Acciones</th>
            </tr>
        </thead>

        <tbody>
            @foreach($peliculas as $pelicula)
            <tr>
                <td>{{ $pelicula->id}}</td>
                <td>{{ $pelicula->titulo}}</td>
                <td>{{ $pelicula->artista}}</td>
                <td>{{ $pelicula->anio}}</td>
                <td>{{ $pelicula->productora}}</td>
                <td>{{ $pelicula->genero}}</td>
                <td>
                    <a href="{{ url('/pelicula/'.$pelicula->id.'/edit') }}">
                        Editar
                    </a>
                    |

                    <form action="{{ url('/pelicula/'.$pelicula->id) }}" method="post">
                        @csrf
                        {{ method_field('DELETE') }}
                        <input type="submit" onclick="return confirm('Quieres Borrar?')" value="Borrar">
                    </form>




                </td>
            </tr>
            @endforeach
        </tbody>
    </table>
</body>

</html>