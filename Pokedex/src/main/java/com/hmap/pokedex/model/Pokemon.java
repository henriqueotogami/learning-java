package com.hmap.pokedex.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Pokemon {

    @Id
    private String id;
    private String name;
    private String category;
    private String ability;
    private Double weight;

    public Pokemon(String id, String name, String category, String ability, Double weight) {
        this.id         = id;
        this.name       = name;
        this.category   = category;
        this.ability    = ability;
        this.weight     = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pokemon)) return false;
        Pokemon pokemon  = (Pokemon) o;
        return Objects.equals(id,           pokemon.id)         &&
                Objects.equals(name,        pokemon.name)       &&
                Objects.equals(category,    pokemon.category)   &&
                Objects.equals(ability,     pokemon.ability)    &&
                Objects.equals(weight,      pokemon.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, category, ability, weight);
    }

    @Override
    public String toString() {
        return "Pokemon{"       +
                "id='"          + id        + '\'' +
                ", name='"      + name      + '\'' +
                ", category='"  + category  + '\'' +
                ", ability='"   + ability   + '\'' +
                ", weight='"    + weight    +
                '}';
    }
}
