package com.bcp.best_travel.domain.repositories;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.io.Serializable;

public class CustomerEntity implements Serializable {

    @Id
    private String dni;
    @Column(length = 50)
    private String fullName;
    @Column(length = 20)
    private String creditCard;
    @Column(length = 12)
    private String phoneNumber;
    private Integer totalFlights;
    private Integer totalLodgings;
    private Integer totalTours;

}
