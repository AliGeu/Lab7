
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
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object clients extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.4*/("""

"""),_display_(/*4.2*/main("Clients")/*4.17*/ {_display_(Seq[Any](format.raw/*4.19*/("""
  """),format.raw/*5.3*/("""<h3>
    Our Clients
  </h3>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 24 14:53:30 GMT 2017
                  SOURCE: /home/wdd/webapps/WMDDCoreDesign/app/views/clients.scala.html
                  HASH: 7a08d1a6fc41d24bfa57933cc3a5a43c9b2c379e
                  MATRIX: 943->2|1039->4|1067->7|1090->22|1129->24|1158->27
                  LINES: 28->2|33->2|35->4|35->4|35->4|36->5
                  -- GENERATED --
              */
          