package com.coderhouse.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.dtos.ClienteDTO;
import com.coderhouse.models.Cliente;
import com.coderhouse.repositories.ClienteRepository;

@Service
public class ClienteService {

	 @Autowired
	    private ClienteRepository clienteRepository;
	 
	    // Convertir entidad a DTO
	    private ClienteDTO convertirAClienteDTO(Cliente cliente) {
	        ClienteDTO dto = new ClienteDTO();
	        dto.setId(cliente.getId());
	        dto.setNombre(cliente.getNombre());
	        dto.setEmail(cliente.getEmail());
	        dto.setTelefono(cliente.getTelefono());
	        return dto;
	    }

	    // Convertir DTO a entidad
	    private Cliente convertirADominio(ClienteDTO dto) {
	        Cliente cliente = new Cliente();
	        cliente.setId(dto.getId());
	        cliente.setNombre(dto.getNombre());
	        cliente.setEmail(dto.getEmail());
	        cliente.setTelefono(dto.getTelefono());
	        return cliente;
	    }

	    public List<ClienteDTO> obtenerTodosLosClientes() {
	        return clienteRepository.findAll()
	                .stream()
	                .map(this::convertirAClienteDTO)
	                .collect(Collectors.toList());
	    }

	    public ClienteDTO obtenerClientePorId(Long id) {
	        Cliente cliente = clienteRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
	        return convertirAClienteDTO(cliente);
	    }

	    public ClienteDTO guardarCliente(ClienteDTO clienteDTO) {
	        Cliente cliente = convertirADominio(clienteDTO);
	        Cliente clienteGuardado = clienteRepository.save(cliente);
	        return convertirAClienteDTO(clienteGuardado);
	    }

	    public ClienteDTO actualizarCliente(Long id, ClienteDTO clienteDTO) {
	        Cliente clienteExistente = clienteRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

	        clienteExistente.setNombre(clienteDTO.getNombre());
	        clienteExistente.setEmail(clienteDTO.getEmail());
	        clienteExistente.setTelefono(clienteDTO.getTelefono());

	        Cliente clienteActualizado = clienteRepository.save(clienteExistente);
	        return convertirAClienteDTO(clienteActualizado);
	    }

	    public void eliminarCliente(Long id) {
	        clienteRepository.deleteById(id);
	    }

}
