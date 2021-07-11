
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

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Array[Student],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(students : Array[Student]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.29*/("""
"""),format.raw/*3.1*/("""<!doctype html>
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
            """),_display_(/*18.14*/for(student <- students) yield /*18.38*/ {_display_(Seq[Any](format.raw/*18.40*/("""
                """),format.raw/*19.17*/("""<tr>
                    <th>"""),_display_(/*20.26*/student/*20.33*/.IndexNo),format.raw/*20.41*/("""</th>
                    <th>"""),_display_(/*21.26*/student/*21.33*/.RegistrationNo),format.raw/*21.48*/("""</th>
                    <th>"""),_display_(/*22.26*/student/*22.33*/.Name),format.raw/*22.38*/("""</th>
                </tr>
            """)))}),format.raw/*24.14*/("""

        """),format.raw/*26.9*/("""</table>

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
                  HASH: 72b002b602499899be75c8b71fab8a2f324973e5
                  MATRIX: 432->1|765->25|887->52|915->54|1454->566|1494->590|1534->592|1580->610|1638->641|1654->648|1683->656|1742->688|1758->695|1794->710|1853->742|1869->749|1895->754|1969->797|2008->809
                  LINES: 17->1|22->2|27->2|28->3|43->18|43->18|43->18|44->19|45->20|45->20|45->20|46->21|46->21|46->21|47->22|47->22|47->22|49->24|51->26
                  -- GENERATED --
              */
          