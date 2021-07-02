//package de.its.lf;
//
//public class PersonFromFile extends Person {
//
//    private static String separator;
//
//    public PersonFromFile(String lineIn) {
//        String[] parts = lineIn.split(separator);
//        firstName = parts[0];
//        lastName = parts[1];
//        number = Integer.parseInt(parts[2]);
//        street = parts[3];
//        birthDate = parts[4];
//        postalCode = Integer.parseInt(parts[5]);
//        city = parts[6];
//        phone = parts[7];
//    }
//
//    PersonFromFile(Person person) {
//        firstName = person.getFirstName();
//        lastName = person.getLastName();
//        number = person.getNumber();
//        street = person.getStreet();
//        birthDate = person.getBirthDate();
//        postalCode = person.getPostalCode();
//        city = person.getCity();
//        phone = person.getPhone();
//
//    }
//
//    public String toFile() {
//        return  firstName + separator + lastName + separator + number + separator + street + separator + birthDate + separator + postalCode +separator+ city + separator + phone;
//    }
//
//    public static String getSeparator() {
//        return separator;
//    }
//
//    public static void setSeparator(String separator) {
//        PersonFromFile.separator = separator;
//    }
//}
