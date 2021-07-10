package controllers

import javax.inject.Inject
import play.api._
import play.api.mvc._
import play.api.db._

import java.sql.{Connection, ResultSet, Statement}

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
class HomeController @Inject()(db: Database, cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */

  // creating the database connection to retrieve the data
  val connection: Connection = db.getConnection()
  val statement: Statement = connection.createStatement
  val query = "SELECT * FROM groupdetails"
  val results: ResultSet = statement.executeQuery(query)

  // creating three array variables to store the database query details
  var indexSet: Array[Int] = new Array[Int](3) // Index No array
  var registrationNoSet: Array[String] = new Array[String](3) // Registration No array
  var nameSet : Array[String] = new Array[String](3) // Name Array

  var i: Int =0
  while(results.next()){
    indexSet(i) = results.getInt("IndexNo")
    registrationNoSet(i) = results.getString("RegistrationNo")
    nameSet(i) = results.getString("Name")
    i= i+1
  }
  def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def explore(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.explore())
  }

  def tutorial(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.tutorial())
  }
  def home: Action[AnyContent] = Action{implicit request: Request[AnyContent] =>
    Ok(views.html.home(
      indexSet(0),indexSet(1),indexSet(2),registrationNoSet(0),registrationNoSet(1),registrationNoSet(2),
      nameSet(0),nameSet(1),nameSet(2)
    ))
  }
}

