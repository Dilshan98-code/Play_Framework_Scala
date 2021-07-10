package Models
import scala.collection.immutable._


case  class Book {
  var id : Int
  var title : String
  var price : Int
  var author : String

  def Book(id : Int, title : String, price: Int, author: String): Unit =
  {
    this.id = id
    this.title = title
    this.price = price
    this.author = author
  }
  var books: Set[Book] = Set((1,"C++",20,"ABC"),(2,"Java",30,"XYZ"))

  def allBooks: Set[Book]={
    return this.books
  }

  def findById(id : Int) : Object[Book]={
    for(book <- this.books){
      if(book.id.equals(id))
        return book
    }
    return null
  }

  def add(book: Book){

  }

  def remove(book: Book): Boolean ={
    if(books.isEmpty.equals(false)){
      books = books.-(book)
      return true
    }
    else{
      return false
    }
  }

}
