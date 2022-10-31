package com.pds.Registration.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="table_patient_info")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class PatientDetails {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Id
    @Column(name="c_user_id")
    private String userId;
    @Column(name="c_first_name")
    private String firstName;
    @Column(name="c_last_name")
    private String lastName;
    @Column(name="c_email_if")
    private String emailId;
    @Column(name="c_mobile")
    private String mobile;
    @Column(name="c_phone")
    private String phone;
    @Column(name="c_address_line1")
    private String addressLine1;
    @Column(name="c_address_line2")
    private String addressLine2;
    @Column(name="c_postcode")
    private String postcode;
    @Column(name="c_state")
    private String state;
    @Column(name="c_country")
    private String country;
    @Column(name="c_user_name")
    private String username;

}
