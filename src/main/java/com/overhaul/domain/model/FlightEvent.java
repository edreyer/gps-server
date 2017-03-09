package com.overhaul.domain.model;


import lombok.Builder;
import lombok.ToString;
import lombok.Value;

import java.util.Date;

/**
 * Created by erikdreyer on 3/7/17.
 */
@Value
@Builder
@ToString
public class FlightEvent {

    String icao24;
    Date timestamp;
    Double latitude;
    Double longitude;

}
