package controllers

import Models.Student

import javax.inject.Inject
import play.api._
import play.api.mvc._
import play.api.db._

import java.lang.reflect
import java.sql.{Connection, ResultSet, Statement}

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
class HomeController @Inject()(db: Database, cc: ControllerComponents) extends AbstractController(cc) {

  // creating the database connection to retrieve the data
  val connection: Connection = db.getConnection()
  val statement: Statement = connection.createStatement
  val query = "SELECT * FROM `groupdetails`"
  val results: ResultSet = statement.executeQuery(query)

  // creating object array of students
  var students = new Array[Student](3)
  // add values to the array objects
    var i : Int = 0
    while(results.next()){
      students(i) = new Student(
        results.getInt("IndexNo"):Int,
        results.getString("RegistrationNo"):String,
        results.getString("Name"):String
      )
      i= i+1
    }

// default started package functions
  def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def explore(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.explore())
  }

  def tutorial(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.tutorial())
  }

  // define home function to show the details in html view
  def home: Action[AnyContent] = Action{implicit request: Request[AnyContent] =>
    Ok(views.html.home(students))
  }
}

