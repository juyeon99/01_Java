package com.ohgiraffers.api.hair;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Hair {
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;
    private LocalDate birthday;
    private LocalDate reservation_date;
    private LocalTime reservation_time;
    private LocalDateTime created_at;

    public Hair() {
    }

    public Hair(int id, String first_name, String last_name, String email, String gender, LocalDate birthday, LocalDate reservation_date, LocalTime reservation_time, LocalDateTime created_at) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.birthday = birthday;
        this.reservation_date = reservation_date;
        this.reservation_time = reservation_time;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getReservation_date() {
        return reservation_date;
    }

    public void setReservation_date(LocalDate reservation_date) {
        this.reservation_date = reservation_date;
    }

    public LocalTime getReservation_time() {
        return reservation_time;
    }

    public void setReservation_time(LocalTime reservation_time) {
        this.reservation_time = reservation_time;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public void printAllCustomers(Hair[] customers) {
        for (int i = 0; i < customers.length; i++){
            System.out.println("============================");

            System.out.println("id = " + customers[i].getId());
            System.out.println("name = " + customers[i].getFirst_name() + " " + customers[i].getLast_name());
            System.out.println("email = " + customers[i].getEmail());
            System.out.println("gender = " + customers[i].getGender());
            System.out.println("birthday = " + customers[i].getBirthday());
            System.out.println("reservation_date = " + customers[i].getReservation_date());
            System.out.println("reservation_time = " + customers[i].getReservation_time());
            System.out.println("created_at = " + customers[i].getCreated_at());
        }
        System.out.println("============================");
    }

    @Override
    public String toString() {
        return "Hair{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", reservation_date=" + reservation_date +
                ", reservation_time=" + reservation_time +
                ", created_at=" + created_at +
                '}';
    }
}
