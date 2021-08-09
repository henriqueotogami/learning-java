package com.hmap.pokedex.repository;

import com.hmap.pokedex.model.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PokedexRepository extends ReactiveMongoRepository <Pokemon, String>{
}
