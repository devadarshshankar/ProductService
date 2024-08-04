package dev.adarsh.productservice.clients.authenticationClient.dtos;

import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class UserDto {
    private String email;
    @ManyToMany
    private Set<Role> roles= new HashSet<>();

}
