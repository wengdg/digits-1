package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.NewContact;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }

  /**
   * Returns New contact page.
   * @return The NewContact.
   */
  public static Result newContact() {
    return ok(NewContact.render("Welcome to New Contact."));

  }

}
