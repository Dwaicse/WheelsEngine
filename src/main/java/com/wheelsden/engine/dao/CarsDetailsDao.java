package com.wheelsden.engine.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity()
@Table(name="cars_details")
@Getter
@Setter
@NoArgsConstructor
public class CarsDetailsDao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String car_type;
    private String make_year;
    private String registration_year;
    private String tax_paid_till;
    private String registration_state;
    private String engine_type;
    private String kms_driven;
    private String status;
    private String updated_at;
    private String date_loaded;



}
