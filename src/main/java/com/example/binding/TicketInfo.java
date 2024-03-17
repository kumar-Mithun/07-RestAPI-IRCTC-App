package com.example.binding;

//import jakarta.persistence.Entity;
import lombok.Data;

//output Data//Response Binding
@Data

public class TicketInfo
{
	private Integer ticketId;
	private String pnr;
	private String ticketStatus;
}
