package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.binding.PassengerInfo;
import com.example.binding.TicketInfo;

@RestController
public class TicketRestController
{
	@GetMapping("/")
	public ResponseEntity<String> getTicket()
	{
		
		String ticket="hello mithun";
		
		
		return new ResponseEntity<String>(ticket,HttpStatus.OK);
	}
	@GetMapping("/ticket/{ticketId}")
	public ResponseEntity<TicketInfo> getTicket(@PathVariable("ticketId") Integer ticketId)
	{
		
		//logic to get ticket
		
		TicketInfo tinfo = new TicketInfo();
		tinfo.setTicketId(1234);
		tinfo.setPnr("LKFND5678");
		tinfo.setTicketStatus("CONFIRMED");
		
		
		return new ResponseEntity<>(tinfo,HttpStatus.OK);
	}
	@PostMapping("/ticket")
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo request)
	{
		System.out.println(request);
		//logic to book ticket
		TicketInfo tinfo = new TicketInfo();
		tinfo.setTicketId(1234);
		tinfo.setPnr("JLJL6868");
		tinfo.setTicketStatus("CONFIRMED");
		return new ResponseEntity<>(tinfo, HttpStatus.CREATED);
		
	}
	
	@PutMapping("/ticket")
	public ResponseEntity<String> updateTicket(@RequestBody PassengerInfo request)
	{
		System.out.println(request);
		//logic to update ticket
		return new ResponseEntity<>("Ticket Updated",HttpStatus.CREATED);
	}
	
	@DeleteMapping("/ticket/{ticketId}")
	public ResponseEntity<String> deleteTicket(@PathVariable("ticketId")  Integer ticketId)
	{
		
		//logic to delete ticket
		return new ResponseEntity<>("Ticket deleted",HttpStatus.OK);
	}
	
}
