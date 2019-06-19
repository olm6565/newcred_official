package br.com.olmti.newcred.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.status.StatusData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.olmti.newcred.controller.vo.SexoVO;
import br.com.olmti.newcred.dao.CepDAO;
import br.com.olmti.newcred.dao.ClienteDAO;
import br.com.olmti.newcred.dao.OperadoraDAO;
import br.com.olmti.newcred.dao.OrigemDAO;
import br.com.olmti.newcred.dao.StatusClienteDAO;
import br.com.olmti.newcred.dao.TpEstadoCivilDAO;
import br.com.olmti.newcred.dao.TpParceriaDAO;
import br.com.olmti.newcred.dao.UsuarioDAO;
import br.com.olmti.newcred.model.Cliente;
import br.com.olmti.newcred.model.StatusCliente;
import br.com.olmti.newcred.model.Usuario;


@Controller
public class ClienteController {	
	@Autowired
	private UsuarioDAO usuarioDao;	
	@Autowired
	private ClienteDAO clienteDao;
	@Autowired
	private OrigemDAO origemDAO;
	@Autowired
	private TpParceriaDAO tpParceriaDAO;
	@Autowired
	private TpEstadoCivilDAO tpEstadoCivilDAO;
	@Autowired
	private OperadoraDAO operadoraDAO;
	@Autowired
	private StatusClienteDAO statusClienteDAO;
	@Autowired
	private CepDAO cepDAO;


	@RequestMapping(value = {"/clientes"}, method = RequestMethod.GET) 
	public String show(Model model,@ModelAttribute("usuario") Usuario usuario) {
		model.addAttribute("usuario", usuario);
		model.addAttribute("listaCliente" , clienteDao.findAll());
		return "clientes";
	}
	
	@RequestMapping(value = {"/findClientes"}, method = RequestMethod.GET) 
	public String findById(Model model,
			@ModelAttribute("usuario") Usuario usuario,
			@ModelAttribute("id") Integer id) {
		model.addAttribute("usuario", usuario);
		model.addAttribute("cliente" , clienteDao.findById(id.longValue()));
		return "clientes";
	}

	@RequestMapping(value = {"/inserirCliente"}, method=RequestMethod.GET)
	public String showAdd(Model model,
		@ModelAttribute("usuario") Usuario usuario) {

		model.addAttribute("parcerias" , tpParceriaDAO.findAll());
		model.addAttribute("estadosCivil" , tpEstadoCivilDAO.findAll());
		model.addAttribute("origens" , origemDAO.findAll());
		model.addAttribute("operadoras" , operadoraDAO.findAll());
		model.addAttribute("statuss" , statusClienteDAO.findAll());
		model.addAttribute("usuarios" , usuarioDao.findAll());
		model.addAttribute("usuario", usuario);
		model.addAttribute("cliente" , new Cliente());
		
		List<SexoVO> sexos = new ArrayList<SexoVO>();		
		sexos.add(new SexoVO (1,"Masculino"));
		sexos.add(new SexoVO (2, "Feminino"));
		model.addAttribute("sexos" , sexos);		
		
		return "manterCliente";
	}
	
	@PostMapping("/salvarCliente")
	public String showAdd(Model model,
			@ModelAttribute("usuario") Usuario usuario,
			@ModelAttribute("cliente") Cliente cliente) {
				
		cliente = preparaCliente(cliente);
		clienteDao.save(cliente);
		
		model.addAttribute("usuario", usuario);
		model.addAttribute("cliente" , cliente);
				
		return "clientes";
	}
	
	private Cliente preparaCliente (Cliente cliente) {
		cliente.setCep(cepDAO.findByCep(cliente.getCep().getCep()));
		cliente.setStatus(statusClienteDAO.findById(cliente.getStatus().getId()).get());
		cliente.setOrigem(origemDAO.findById(cliente.getOrigem().getId()).get());	
		cliente.setTpParceria(tpParceriaDAO.findById(cliente.getTpParceria().getId()).get());
		cliente.setParceiro(usuarioDao.findById(cliente.getParceiro().getId()).get());
		return cliente;		
	}
}
