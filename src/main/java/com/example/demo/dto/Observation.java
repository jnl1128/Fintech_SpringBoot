
package com.example.demo.dto;

import com.example.demo.entity.FredData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

//DTO Service <-> Controller <-> DTO
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Observation {

    String date;
    Double value;

    // Entity Converter
    public static Observation fromFredData(FredData fredData) {
        return new Observation(fredData.getObservationDate(), fredData.getValue());
    }
}