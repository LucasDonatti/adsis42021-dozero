package com.unicesumar.adsis4s2021.dozero.meu.base;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RegistroNãoExistente extends RuntimeException {

}
