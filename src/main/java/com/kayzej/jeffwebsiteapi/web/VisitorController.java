package com.kayzej.jeffwebsiteapi.web;

import java.util.List;

// import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Visitor Controller", description = "Create and retrieve visitor messages")
@RestController
public class VisitorController {

    // @Autowired
    // private VistorService visitorService;

    @Operation(summary = "Hello World", description = "Hello World")
    @ApiResponse(responseCode = "200", description = "successful hello world")
    @GetMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> helloDefault() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @Operation(summary = "Hello World", description = "Hello World")
    @ApiResponse(responseCode = "200", description = "successful hello world")
    @GetMapping(value = "/api/helloworld", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<>("{\"message\": \"Hello, JSON!\"}", HttpStatus.OK);
    }

    // @Operation(summary = "Retrieves contacts", description = "Provides a list of
    // all contacts")
    // @ApiResponse(responseCode = "200", description = "Successful retrieval of
    // contacts", content = @Content(array = @ArraySchema(schema =
    // @Schema(implementation = Contact.class))))
    // @GetMapping(value = "/contact/all", produces =
    // MediaType.APPLICATION_JSON_VALUE)
    // public ResponseEntity<List<Contact>> getContacts() {
    // List<Contact> contacts = contactService.getContacts();
    // return new ResponseEntity<>(contacts, HttpStatus.OK);
    // }

    // @Operation(summary = "Get contact by Id", description = "Returns a contact
    // based on an ID")
    // @ApiResponses(value = {
    // @ApiResponse(responseCode = "404", description = "Contact doesn't exist",
    // content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
    // @ApiResponse(responseCode = "200", description = "Successful retrieval of
    // contact", content = @Content(schema = @Schema(implementation =
    // Contact.class))),
    // })
    // @GetMapping(value = "/contact/{id}", produces =
    // MediaType.APPLICATION_JSON_VALUE)
    // public ResponseEntity<Contact> getContact(@PathVariable String id) {
    // Contact contact = contactService.getContactById(id);
    // return new ResponseEntity<>(contact, HttpStatus.OK);
    // }

    // @Operation(summary = "Create Contact", description = "Creates a contact from
    // the provided payload")
    // @ApiResponses(value = {
    // @ApiResponse(responseCode = "201", description = "Successful creation of
    // contact"),
    // @ApiResponse(responseCode = "400", description = "Bad request: unsuccessful
    // update", content = @Content(schema = @Schema(implementation =
    // ErrorResponse.class)))
    // })
    // @PostMapping(value = "/contact", produces = MediaType.APPLICATION_JSON_VALUE)
    // public ResponseEntity<Contact> createContact(@Valid @RequestBody Contact
    // contact) {
    // contactService.saveContact(contact);
    // return new ResponseEntity<>(contact, HttpStatus.CREATED);
    // }

}