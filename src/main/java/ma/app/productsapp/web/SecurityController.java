package ma.app.productsapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class SecurityController {
@GetMapping("/logout")
    public String logout(HttpServletRequest request) throws ServletException {
request.logout();
return "redirect: http://localhost:8080/realms/eco_realm/protocol/openid-connect/logout?redirect_uri=http://localhost:8087 ";
}




}
