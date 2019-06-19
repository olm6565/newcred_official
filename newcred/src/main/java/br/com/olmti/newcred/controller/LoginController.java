package br.com.olmti.newcred.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//import br.com.olmti.newcred.auth.SecurityAuthImpl.SecurityServiceImpl;
import br.com.olmti.newcred.controller.vo.LoginVO;
import br.com.olmti.newcred.dao.UsuarioDAO;
import br.com.olmti.newcred.model.Usuario;
import br.com.olmti.newcred.validator.UsuarioValidator;

@Controller
@RequestMapping(value = {"/" , "/index"}, method = RequestMethod.GET)
public class LoginController {	
	@Autowired
	private UsuarioDAO usuarioDao;
	
	@Autowired
	private UsuarioValidator usuarioValidator;
	
//	@Autowired
//	private SecurityServiceImpl securityService;

	@GetMapping(value = {"/" , "/index" , "/login"})
	public String show(Model model) {


		
		model.addAttribute("login", new LoginVO());
		
		return "index";
	}	
	
	@PostMapping("/autenticar")
	public String autenticar(Model model,RedirectAttributes redirectAttributes,@ModelAttribute("login") LoginVO login) {

		Usuario usuario = usuarioDao.findLogin(login.getUsuario());
		
		if (!usuario.getSenha().equals(login.getSenha())) {					
			return null;
		} else {		
			redirectAttributes.addFlashAttribute("usuario", usuario);
			return "redirect:dashboard";
		}
	}
	
}
