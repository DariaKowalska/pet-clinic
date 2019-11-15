package com.myproject.petclinic.model;

import javax.swing.*;

public class Speciality extends BaseEntity {
    private Spring description;

    public Spring getDescription() {
        return description;
    }

    public void setDescription(Spring description) {
        this.description = description;
    }
}
