package com.axis.lms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;




@ControllerAdvice
public class GlobalExceptionHandler {

	
@ExceptionHandler(value = StakeholderNotFoundException.class)
	
	public ResponseEntity<String>StakeholdertNotFoundExceptionHandler(StakeholderNotFoundException ex){
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
		
		
	}

@ExceptionHandler(value = StakeholderAlreadyExistsException.class)
public ResponseEntity<String> handlerStakeholderAlreadyExistsException(StakeholderAlreadyExistsException e) {
	return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
}

@ExceptionHandler(value= EmployeeNotFoundException.class)
public ResponseEntity<String>UserNotFoundExceptionHandler(EmployeeNotFoundException ex){
	return new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
}


@ExceptionHandler(value = EmployeeAlreadyExistsException.class)
public ResponseEntity<String> handlerEmployeeAlreadyExistsException(EmployeeAlreadyExistsException e) {
	return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
}

@ExceptionHandler(value = InternalJobNotFoundException.class)

public ResponseEntity<String>InternalJobtNotFoundExceptionHandler(InternalJobNotFoundException ex){
	return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
}
@ExceptionHandler(value = InternalJobAlreadyExistsException.class)
public ResponseEntity<String> handlerInternalJobAlreadyExistsException(InternalJobAlreadyExistsException e) {
return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
}
@ExceptionHandler(value = ProjectNotFoundException.class)
public ResponseEntity<String>projectNotFoundExceptionHandler(ProjectNotFoundException ex){
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}

  @ExceptionHandler(value = ProjectAlreadyExistsException.class)
  public ResponseEntity<String> handlerProjectAlreadyExistsException(ProjectAlreadyExistsException e) {
	return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
}
  @ExceptionHandler(value = SupportTeamNotFoundException.class)
	public ResponseEntity<String> SupportTeamNotFoundException(SupportTeamNotFoundException e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = SupportTeamAlreadyExistsException.class)
	public ResponseEntity<String> handlerSupportTeamAlreadyExistsException(SupportTeamAlreadyExistsException e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = NewsNotFoundException.class)
	
	public ResponseEntity<String>newsNotFoundExceptionHandler(NewsNotFoundException ex){
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}
	

}
