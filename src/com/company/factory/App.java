package com.company.factory;


// It doesnt work right now
public class App {

//    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){
        Person person1 = PersonFactory.getPerson(PersonType.MAN);
        Person person2 = PersonFactory.getPerson(PersonType.WOMAN);

//        LOGGER.info(person1::getDescription);
//        LOGGER.info(person2::getDescription);
    }
}
