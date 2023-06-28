<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\pelicula>
 */
class PeliculaFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition(): array
    {
        return [
            "titulo" => fake()->title(),
            "artista_principal" => fake()->name(),
            "anio"=>fake()->year(),
            "productora"=>fake()->address(),
            "genero"=>fake()->lastName()
            //
        ];
    }
}
