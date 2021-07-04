
package views.html.Home

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

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name : String, lastname: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*3.1*/("""<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>My Welcome Page</title>
    </head>
    <body>
        <p>Welcome """),_display_(/*12.21*/name),format.raw/*12.25*/(""" """),_display_(/*12.27*/lastname),format.raw/*12.35*/(""" """),format.raw/*12.36*/("""To our Website</p>
    </body>
</html>"""))
      }
    }
  }

  def render(name:String,lastname:String): play.twirl.api.HtmlFormat.Appendable = apply(name,lastname)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (name,lastname) => apply(name,lastname)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Home/welcome.scala.html
                  HASH: 4dc415d9e77c9a1aae3d298400dc8f53e47a15ec
                  MATRIX: 743->1|871->34|901->38|1291->401|1316->405|1345->407|1374->415|1403->416
                  LINES: 21->1|26->1|28->3|37->12|37->12|37->12|37->12|37->12
                  -- GENERATED --
              */
          