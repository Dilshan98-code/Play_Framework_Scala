package Models

abstract class Student() {
  var index: Int
  var registrationNo: String
  var name: String

  def Student(index: Int, registrationNo: String, name: String): Unit = {
    this.index = index
    this.registrationNo = registrationNo
    this.name = name
  }
}
