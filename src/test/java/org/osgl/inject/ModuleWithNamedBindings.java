package org.osgl.inject;

import org.osgl.inject.annotation.Provides;

import javax.inject.Named;

class ModuleWithNamedBindings {

    @Provides
    @Named("male")
    public Person male(Person.Man man) {
        return man;
    }


    @Provides
    @Named("female")
    public Person female(Person.Woman woman) {
        return woman;
    }

}