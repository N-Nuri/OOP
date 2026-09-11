package com.mycompany.manhattan;

// de bai chi yeu cau restaurant co ten + vi tri (da co san trong Place),
// khong yeu cau field rieng nao khac nhu Museum (admissionPrice) hay Shop (items, workingHours)
public class Restaurant extends Place {

    public Restaurant(Location location, String name) {
        super(location, name);
    }
}
