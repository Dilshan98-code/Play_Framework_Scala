package Models
import scala.collection.immutable._

public abstract class Book {
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
  var books:HashSet[Book] = HashSet((1,"C++",20,"ABC"),(2,"Java",30,"XYZ"))


  def allBooks: HashSet[Book]={
    return books
  }

  def findById(id : Int) : Book={
    for(book <- books){
      if(book.id.equals(id))
        return book
    }
    return null
  }

  def add(book: Book): Unit ={
    books = books.+(book)
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
