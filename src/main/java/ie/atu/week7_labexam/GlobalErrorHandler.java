package ie.atu.week7_labexam;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.*;

@RestControllerAdvice
public class GlobalErrorHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> showErrors(MethodArgumentNotValidException ex) {
        Map<String, String> errorList = new HashMap<>();
        for(FieldError error: ex.getFieldErrors()) {
            String errorName = error.getField();
            String errorMessage = error.getDefaultMessage();
            errorList.put(errorName, errorMessage);
        }
        return ResponseEntity.status(400).body(errorList);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<List<String>> showMissing(NoSuchElementException ex) {
        List<String> errorList = new ArrayList<>();
        errorList.add("RentalNotFoundException,");
        errorList.add("Rental code not found,");
        errorList.add("404");
        return ResponseEntity.status(404).body(errorList);
    }
}
