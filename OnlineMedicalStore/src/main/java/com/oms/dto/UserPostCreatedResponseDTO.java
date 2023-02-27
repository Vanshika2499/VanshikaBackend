package com.oms.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPostCreatedResponseDTO implements MyDTO {
	
	private String userName;
	private String password;
	private String role;


}