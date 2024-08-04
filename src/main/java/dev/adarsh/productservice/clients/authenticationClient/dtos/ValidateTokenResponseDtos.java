package dev.adarsh.productservice.clients.authenticationClient.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidateTokenResponseDtos {
    private UserDto userDto;
    private SessionStatus sessionStatus;
}
