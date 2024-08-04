package dev.adarsh.productservice.clients.authenticationClient;

import dev.adarsh.productservice.clients.authenticationClient.dtos.ValidateTokenRequestDto;
import dev.adarsh.productservice.clients.authenticationClient.dtos.ValidateTokenResponseDtos;
import dev.adarsh.productservice.clients.fakestoreapi.FakeStoreProductDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class AuthenticationClient {

    private RestTemplateBuilder restTemplateBuilder;
    public AuthenticationClient(RestTemplateBuilder restTemplateBuilder){
        this.restTemplateBuilder=restTemplateBuilder;
    }
    public ValidateTokenResponseDtos validate(String token,Long userId){
        RestTemplate restTemplate=restTemplateBuilder.build();

        ValidateTokenRequestDto requestDto=new ValidateTokenRequestDto();
        requestDto.setToken(token);
        requestDto.setUserId(userId);

        ResponseEntity<ValidateTokenResponseDtos> response=restTemplate.postForEntity(
                "http://localhost:9000/auth/validate",
                requestDto,
                ValidateTokenResponseDtos.class);
        return response.getBody();
    }

}
