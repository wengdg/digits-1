package models;

/**
 * Model for contacts.
 * Created by Jack on 3/14/2015.
 */
public class Contact {
  private String firstName;
  private String lastName;
  private String telephone;

  /**
   * Creates a model of a contact.
   *
   * @param firstName The first name.
   * @param lastName  The second name.
   * @param telephone The telephone number.
   */
  public Contact(String firstName, String lastName, String telephone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
  }

  /**
   * Gets first name.
   *
   * @return First name.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Gets last name.
   *
   * @return Last name.
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Gets telephone number.
   *
   * @return Telephone number.
   */
  public String getTelephone() {
    return telephone;
  }
}
