package org.but.feec.cinema.service;

import org.but.feec.cinema.data.PersonRepository;

public class AuthService {
    private PersonRepository personRepository;

    public AuthService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
}
