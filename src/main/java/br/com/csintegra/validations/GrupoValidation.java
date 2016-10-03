package br.com.csintegra.validations;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.csintegra.models.Grupo;

public class GrupoValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Grupo.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nomeGrupo", "nomeGrupo.name.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "descricao", "descricao.name.empty");
	}

}
