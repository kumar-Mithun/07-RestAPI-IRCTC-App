package com.example.binding;

//import org.springframework.boot.autoconfigure.domain.EntityScan;


import lombok.Data;
@Data

//input Data//Request Binding
public class PassengerInfo
{
	private String name;
	private Long phno;
	private String jdate;
	private String from;
	private String to;
	private Integer trainNum;
	
}
