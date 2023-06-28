<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    Formulario de edicion de empleado <br>
    <form action="{{ url('/pelicula/'.$pelicula->id) }}" method="post" enctype="multipart/form-data">
        @csrf
        {{ method_field('PATCH')}}

        @include('pelicula.form')
    </form>


</body>

</html>