package info.jab.microservices;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class LoginCredential2 {
    private String user;
    private String password;
}