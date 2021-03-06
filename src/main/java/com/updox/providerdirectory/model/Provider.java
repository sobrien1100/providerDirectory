package com.updox.providerdirectory.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PROVIDER_ID")
    private Long id;
    @NotNull
    @Column(name="FIRST_NAME")
    private String firstName;
    @NotNull
    @Column(name="LAST_NAME")
    private String lastName;
    @NotNull
    @Column(name="EMAIL_ADDRESS")
    private String emailAddress;
    @Column(name="SPECIALTY")
    private String specialty;
    @Column(name="PRACTICE_NAME")
    private String practiceName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getPracticeName() {
        return practiceName;
    }

    public void setPracticeName(String practiceName) {
        this.practiceName = practiceName;
    }
}
