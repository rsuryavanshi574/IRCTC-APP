package com.restIRCTCApp.bindings;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketDetails {

    private Integer id;
    private String prn;
    private Integer trainNo;
    private String passengerName;
    private String source;
    private String destination;
    private String status;


}
