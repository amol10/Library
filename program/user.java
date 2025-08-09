package library;

class User {
    Name name;
    Phone phone;
    Address address;
    Email email;

    public User(Name name, Phone phone, Address address, Email email) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }
}

class Name {
    String first;
    String middle;
    String last;
}

class Phone {
    String home;
    String mobile;
}

class Address {
    String house;
    String street;
    String area;
    String city;
}

class Email {
    String email;
}