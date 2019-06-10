package br.com.fabio.cliente;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.fluent.Request;

import com.thoughtworks.xstream.XStream;

public class ClienteWebService {

	public static void main(String[] args) throws Exception {

		
		String conteudo = Request
		.Post("http://localhost:8080/soc-exame/exames")
		.addHeader("Accept", "application/xml") //just need to change the sufix from the addHead second parameter 
	    .execute()
	    .returnContent()
	    .asString();
		
		
		
		System.out.println(conteudo);
		
	}

}
