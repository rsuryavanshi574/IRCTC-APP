package com.restIRCTCApp.controller;

import com.restIRCTCApp.bindings.PassengerDetails;
import com.restIRCTCApp.bindings.TicketDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TrainRestController {

    @PostMapping(
            value = "/ticket",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<TicketDetails> bookTicket(@RequestBody PassengerDetails passengerDetails){
        System.out.println(passengerDetails);
        TicketDetails ticketDetails = new TicketDetails(1, "KE3244324", passengerDetails.getTrainNo(), passengerDetails.getName(), passengerDetails.getSource(), passengerDetails.getDestination(), "CONFORM");

        return new ResponseEntity<>(ticketDetails, HttpStatus.CREATED);

    }

    @PutMapping("/ticket")
    public ResponseEntity<String> updateDetails(@RequestBody PassengerDetails passengerDetails){
        System.out.println(passengerDetails);

        return new ResponseEntity<>("Ticket is updated", HttpStatus.OK);
    }

    @DeleteMapping("/ticket/{ticketId}")
    public ResponseEntity<String> DeleteTicket(@PathVariable("ticketId") Integer ticketId){

        return new ResponseEntity<>("Ticket has been Deleted", HttpStatus.OK);
    }
}
