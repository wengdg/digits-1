package controllers;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.formdata.ContactFormData;
import views.html.Index;
import views.html.NewContact;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   *
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }

  /**
   * Returns New contact page.
   *
   * @return The NewContact.
   */
  public static Result newContact() {
    Form<ContactFormData> formData = Form.form(ContactFormData.class);
    return ok(NewContact.render(formData));

  }

  /**
   * Processes form submitted by New Contact page.
   *
   * @return The NewContact.
   */
  public static Result postContact() {
    System.out.println("In post contact");
    Form<ContactFormData> formData = Form.form(ContactFormData.class).bindFromRequest();
    ContactFormData data = formData.get();
    System.out.println(data.firstName + " " + data.lastName + " " + data.telephone);
    return ok(NewContact.render(formData));

  }
}
