package com.kayzej.jeffwebsiteapi.web;

import java.util.List;

// import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kayzej.jeffwebsiteapi.pojo.Message;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@Tag(name = "Visitor Controller", description = "Create and retrieve visitor messages")
@RestController
public class VisitorController {

    @Operation(summary = "Hello World", description = "Hello World")
    @ApiResponse(responseCode = "200", description = "successful hello world")
    @GetMapping(value = "/api/helloworld", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<>("{\"message\": \"Hello, from Tomcat!\"}", HttpStatus.OK);
    }

    @Operation(summary = "Store Message", description = "Creates a message from the provided payload")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Successful creation of message"),
            @ApiResponse(responseCode = "400", description = "Bad request: unsuccessful update", content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    })
    @PostMapping(value = "/api/recordMessage", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HttpStatus> recordMessage(@Valid @RequestBody Message message) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}