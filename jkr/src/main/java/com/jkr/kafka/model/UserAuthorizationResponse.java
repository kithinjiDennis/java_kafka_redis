package com.jkr.jkr.model;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;

@Getter
@Setter
public class UserAuthorizationResponse {
    private Set<String> roles;

}
