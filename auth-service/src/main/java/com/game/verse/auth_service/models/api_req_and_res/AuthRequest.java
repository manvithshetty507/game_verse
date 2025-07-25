package com.game.verse.auth_service.models.api_req_and_res;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AuthRequest {
    private String email;
    private String password;
    private String role;
}
