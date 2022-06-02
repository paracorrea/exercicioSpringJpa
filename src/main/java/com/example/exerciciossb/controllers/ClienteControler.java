package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.model.entities.Clientes;

@RestController
@RequestMapping("/clientes")
public class ClienteControler {

	@RequestMapping(path ="obterClientes")
	public Clientes obterCliente( ) {
		
		return new Clientes(28, "Pedro", "123.456.789-1"); 
		
	}

	@GetMapping("/{id}")
	public Clientes obterClientePorId(@PathVariable int id) {
		return new Clientes(id, "Maria", "987.654.321-00");
				
	}
	
	@GetMapping
	public Clientes obterClientePorId2
			(@RequestParam(name ="id", defaultValue ="1") int id)
	{
		return new Clientes(id, "João Augusto", "111.222.333-44");
				
	}
	
}
