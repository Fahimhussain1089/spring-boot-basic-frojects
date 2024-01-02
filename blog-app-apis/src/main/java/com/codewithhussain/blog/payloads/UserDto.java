package com.codewithdurgesh.blog.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private int id;
	@NotEmpty
	@Size(min = 4, message = "NAME DEK SE LIKHO FULL!!")
	private String name;
	
	@Email(message=  "Email address dek kro!!")
	private String email;
	
	@NotEmpty
	@Size(min = 3, max = 12, message = "Password ke length 3 se 12 ke bich rakho")
	private String password;
	@NotEmpty
	private String about;
	

}
