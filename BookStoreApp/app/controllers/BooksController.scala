package controllers

import Models.Book
import com.sun.xml.internal.bind.v2.TODO
import play.mvc._
import play.api.data._
import play.api.data.Forms._
import views.html.books._

import javax.inject.Inject

abstract class BooksController extends Controller{

  var formFactory : Forms.
  // for all books
  def index: TODO = TODO

  //to create book
  def create: Result ={
    val bookForm = Form(
      mapping(

      )(Book.apply)(Book.unapply)
    )
  }

  //to save book
  def save: TODO = TODO

  def edit(id : Int): TODO = TODO

  def update: TODO = TODO

  def destroy(id : Int): TODO = TODO

  // for book details

  def show(id : Int): TODO = TODO

}
