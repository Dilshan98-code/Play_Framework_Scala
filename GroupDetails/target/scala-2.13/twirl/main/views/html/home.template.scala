
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
/*1.2*/import Models.Student
/*2.2*/import controllers.HomeController

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Array[Student],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(students : Array[Student]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.29*/("""
"""),format.raw/*4.1*/("""<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Home</title>
    </head>
    <body>
        <table border="2">
            <tr>
                <th>Index</th>
                <th>Registration</th>
                <th>Name</th>
            </tr>
            """),_display_(/*19.14*/for(student <- students)),format.raw/*19.38*/("""
                """),format.raw/*20.17*/("""<tr>
                    <td>"""),_display_(/*21.26*/student/*21.33*/.index),format.raw/*21.39*/("""</td>
                    <td>"""),_display_(/*22.26*/student/*22.33*/.registrationNo),format.raw/*22.48*/("""</td>
                    <td>"""),_display_(/*23.26*/student/*23.33*/.name),format.raw/*23.38*/("""</td>
                </tr>

        </table>

    </body>
</html>"""))
      }
    }
  }

  def render(students:Array[Student]): play.twirl.api.HtmlFormat.Appendable = apply(students)

  def f:((Array[Student]) => play.twirl.api.HtmlFormat.Appendable) = (students) => apply(students)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/home.scala.html
                  HASH: 4a471daaef5484c4ed0575edc3e65058373ab69e
                  MATRIX: 432->1|461->25|806->61|928->88|956->90|1495->602|1540->626|1586->644|1644->675|1660->682|1687->688|1746->720|1762->727|1798->742|1857->774|1873->781|1899->786
                  LINES: 17->1|18->2|23->3|28->3|29->4|44->19|44->19|45->20|46->21|46->21|46->21|47->22|47->22|47->22|48->23|48->23|48->23
                  -- GENERATED --
              */
          