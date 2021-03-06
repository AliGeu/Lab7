
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Home")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
  """),format.raw/*4.3*/("""<h3>
    Core Design is a professional web design and online application development company based in Dublin, Ireland
  </h3>

  <h4>We specialize in the following areas:</h4>
  <ul>
    <li>Web Design</li>
    <li>Content Management</li>
    <li>Web application development</li>
    <li>Ecommerce and payment</li>
    <li>Security</li>
    <li>Search Engine Optimization</li>
  </ul>

  <p>Please, <a href=""""),_display_(/*18.24*/routes/*18.30*/.HomeController.contact()),format.raw/*18.55*/("""">contact us</a> to discuss your requirements</p> 
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
                  SOURCE: /home/wdd/webapps/WMDDCoreDesign/app/views/index.scala.html
                  HASH: 69fb310257d0de9a9f83ab04844d1511c79a78b4
                  MATRIX: 941->1|1037->3|1065->6|1085->18|1124->20|1153->23|1589->432|1604->438|1650->463
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|50->18|50->18|50->18
                  -- GENERATED --
              */
          