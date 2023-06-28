<?php

namespace App\Http\Controllers;

use App\Models\Pelicula;
use App\Models\Pelicula as ModelsPelicula;
use Illuminate\Http\Request;

class PeliculaController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $datos['peliculas'] = Pelicula::paginate(50);
        return view('pelicula.index', $datos);
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        return view('pelicula.create');
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        $datosPelicula = request()->except('_token');

    

        Pelicula::insert($datosPelicula);

        return response()->json($datosPelicula);
    }

    /**
     * Display the specified resource.
     */
    public function show(Pelicula $pelicula)
    {
        return view('pelicula.show',[
            'pelicula'=>$pelicula
        ]);
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit($id)
    {
        $pelicula = Pelicula::findOrFail($id);

        return view('pelicula.edit', compact('pelicula'));
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Pelicula $id)
    {
        $datosPelicula = request()->except(['_token', '_method']);
        Pelicula::where('id', '=', $id)->update($datosPelicula);

        $empleado = Pelicula::findOrFail($id);
        return view('pelicula.edit', compact('pelicula'));
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy($id)
    {
        //
        Pelicula::destroy($id);
        return redirect('pelicula');
    }
}
