package com.bridgelabz.addressbookapp.exception;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bridgelabz.addressbookapp.dto.ResponseDTO;

@ControllerAdvice
public class PersonExceptionHandler {

	private static final String message = "Exception While Processing REST Request";

	/**
	 * handle MethodArgumentNotValid exceptions.
	 * 
	 * @param : exception
	 * @return : ResponseEntity of Exception and HttpStatus
	 */
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ResponseDTO> handleMethodArgumentNotValidException(
			MethodArgumentNotValidException exception) {
		List<ObjectError> errorList = exception.getBindingResult().getAllErrors();
		List<String> errMesg = errorList.stream().map(objErr -> objErr.getDefaultMessage())
				.collect(Collectors.toList());
		ResponseDTO responseDTO = new ResponseDTO(message, errMesg);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.BAD_REQUEST);
	}

	/**
	 * handle when user or address book Id not found
	 * 
	 * @param : PersonException
	 * @return : ResponseEntity of Exception and HttpStatus
	 */
	@ExceptionHandler(PersonException.class)
	public ResponseEntity<ResponseDTO> handleEmployeePayrollException(PersonException exception) {
		ResponseDTO responseDTO = new ResponseDTO(message, exception.getMessage());
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.BAD_REQUEST);
	}
}
