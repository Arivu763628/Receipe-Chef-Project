package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "home_chefs")
public class HomeChef {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String specialty;

    private String location;

    private String contactNumber;

    public HomeChef() {}

    public HomeChef(String name, String specialty, String location, String contactNumber) {
        this.name = name;
        this.specialty = specialty;
        this.location = location;
        this.contactNumber = contactNumber;
    }

    public Long getId() {
        return id; }

    public void setId(Long id) {
        this.id = id; }

    public String getName() { 
        return name; }

    public void setName(String name) { 
        this.name = name; }

    public String getSpecialty() { 
        return specialty; }

    public void setSpecialty(String specialty) { 
        this.specialty = specialty; }

    public String getLocation() { 
        return location; }

    public void setLocation(String location) { 
        this.location = location; }

    public String getContactNumber() { 
        return contactNumber; }

    public void setContactNumber(String contactNumber) { 
        this.contactNumber = contactNumber; }
}
