package com.driver.controllers;

import com.driver.model.Booking;
import com.driver.model.Facility;
import com.driver.model.Hotel;
import com.driver.model.User;

import java.util.List;

public class HotelManagmentService {
    HotelManagmentRepository hotelManagmentRepository=new HotelManagmentRepository();

    public String addHotel(Hotel hotel) {
        return hotelManagmentRepository.addHotel(hotel);
    }

    public Integer addUser(User user) {
        return hotelManagmentRepository.addUser(user);
    }

    public String getHotelWithMostFacilities() {
        return hotelManagmentRepository.getHOtelWithMostFacilities();
    }

    public int bookARoom(Booking booking) {
        return hotelManagmentRepository.bookARoom(booking);
    }

    public int getBookings(Integer aadharCard) {
        return hotelManagmentRepository.getBookings(aadharCard);
    }

    public Hotel updateFacilities(List<Facility> newFacilities, String hotelName) {
        return hotelManagmentRepository.updateFacilities(newFacilities,hotelName);
    }
}
