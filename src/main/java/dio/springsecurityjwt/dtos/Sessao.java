package dio.springsecurityjwt.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sessao {
    private String login;
    private String token;
}
