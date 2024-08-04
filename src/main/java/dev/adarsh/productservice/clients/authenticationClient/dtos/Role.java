package dev.adarsh.productservice.clients.authenticationClient.dtos;

import dev.adarsh.productservice.models.BaseModel;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Role extends BaseModel {
    private String name;

    public Role(String name) {

    }

    public Role() {

    }
}
