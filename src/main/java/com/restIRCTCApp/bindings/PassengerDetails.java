package com.restIRCTCApp.bindings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassengerDetails {

    private Integer id;
    private String name;
    private Integer trainNo;
    private String source;
    private String destination;
}
