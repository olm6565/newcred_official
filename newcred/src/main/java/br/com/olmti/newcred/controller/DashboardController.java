package br.com.olmti.newcred.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.olmti.newcred.dao.UsuarioDAO;
import br.com.olmti.newcred.model.Usuario;


@Controller
public class DashboardController {	
	@Autowired
	private UsuarioDAO usuarioDao;

	@RequestMapping(value = {"/dashboard"}, method = RequestMethod.GET) 
	public String show(Model model,@ModelAttribute("usuario") Usuario usuario) {
		
		if (usuario == null) {
			return "/";
		}
		model.addAttribute("usuario", usuario);
		return "dashboard";
	}

}
