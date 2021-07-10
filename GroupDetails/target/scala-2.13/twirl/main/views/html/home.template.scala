
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

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[Int,Int,Int,String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id1:Int,id2:Int, id3:Int,
        reg1: String,reg2: String,reg3: String,
        name1: String,name2: String,name3: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.51*/("""

"""),format.raw/*5.1*/("""<!doctype html>
<html lang="en">
    <head>
        <title>Home</title>
    </head>
    <body>
        <table border="2">
            <tr>
                <th>Index</th>
                <th>Registration</th>
                <th>Name</th>
            </tr>
            <tr>
                <td>"""),_display_(/*18.22*/id1),format.raw/*18.25*/("""</td>
                <td>"""),_display_(/*19.22*/reg2),format.raw/*19.26*/("""</td>
                <td>"""),_display_(/*20.22*/name1),format.raw/*20.27*/("""</td>
            </tr>
            <tr>
                <td>"""),_display_(/*23.22*/id2),format.raw/*23.25*/("""</td>
                <td>"""),_display_(/*24.22*/reg2),format.raw/*24.26*/("""</td>
                <td>"""),_display_(/*25.22*/name2),format.raw/*25.27*/("""</td>
            </tr>
            <tr>
                <td>"""),_display_(/*28.22*/id3),format.raw/*28.25*/("""</td>
                <td>"""),_display_(/*29.22*/reg3),format.raw/*29.26*/("""</td>
                <td>"""),_display_(/*30.22*/name3),format.raw/*30.27*/("""</td>
            </tr>
        </table>

    </body>
</html>"""))
      }
    }
  }

  def render(id1:Int,id2:Int,id3:Int,reg1:String,reg2:String,reg3:String,name1:String,name2:String,name3:String): play.twirl.api.HtmlFormat.Appendable = apply(id1,id2,id3,reg1,reg2,reg3,name1,name2,name3)

  def f:((Int,Int,Int,String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (id1,id2,id3,reg1,reg2,reg3,name1,name2,name3) => apply(id1,id2,id3,reg1,reg2,reg3,name1,name2,name3)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/home.scala.html
                  HASH: d3c04119d00e0b52d33bc0984ba47a37b77f834a
                  MATRIX: 775->1|997->128|1027->132|1361->439|1385->442|1440->470|1465->474|1520->502|1546->507|1638->572|1662->575|1717->603|1742->607|1797->635|1823->640|1915->705|1939->708|1994->736|2019->740|2074->768|2100->773
                  LINES: 21->1|28->3|30->5|43->18|43->18|44->19|44->19|45->20|45->20|48->23|48->23|49->24|49->24|50->25|50->25|53->28|53->28|54->29|54->29|55->30|55->30
                  -- GENERATED --
              */
          