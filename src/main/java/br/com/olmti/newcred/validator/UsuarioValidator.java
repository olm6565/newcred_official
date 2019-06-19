package br.com.olmti.newcred.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.olmti.newcred.controller.vo.LoginVO;
import br.com.olmti.newcred.model.Usuario;
import br.com.olmti.newcred.service.UsuarioService;

@Component
public class UsuarioValidator implements Validator {
    @Autowired
    private UsuarioService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return Usuario.class.equals(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
		LoginVO user = (LoginVO) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
        if (user.getUsuario().length() < 6 || user.getUsuario().length() > 32) {
            errors.rejectValue("username", "Size.userForm.username");
        }
        if (userService.findLogin(user.getUsuario()) != null) {
            errors.rejectValue("username", "Duplicate.userForm.username");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (user.getSenha().length() < 8 || user.getSenha().length() > 32) {
            errors.rejectValue("password", "Size.userForm.password");
        }

//        if (!user.getPasswordConfirm().equals(user.getSenha())) {
//            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
//        }
    }

	
}