package br.com.truesystem.mockapi;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gilmario
 */
@RestController
@RequestMapping("login")
@CrossOrigin(origins = "*")
public class LoginRest {

    @GetMapping()
    public String getDados() {
        return "Versão 01";
    }

    @PostMapping
    public LoginResponse login() {
        return new LoginResponse("Gilmario", "gilmariosoftare@gmail.com", "85989926526");

    }

}
