package br.com.grocha.servicos.soap;

import javax.jws.WebService;

import org.springframework.web.context.support.SpringBeanAutowiringSupport;

@WebService
public class GitSoapImpl extends SpringBeanAutowiringSupport implements GitSoap {
	
	public String testeSoap(String nome) {	
		
		String teste = "Hello World ";
		String retorno = teste + nome;
				
		return retorno;		
	}
	
}
