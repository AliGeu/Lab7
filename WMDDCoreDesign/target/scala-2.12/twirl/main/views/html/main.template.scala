
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pageID: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en" id=""""),_display_(/*4.22*/pageID),format.raw/*4.28*/("""">
    <head>
        <title>Core Design - """),_display_(/*6.31*/pageID),format.raw/*6.37*/("""</title> 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.versioned("stylesheets/Style.css")),format.raw/*8.103*/("""" />
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.versioned("stylesheets/Form.css")),format.raw/*9.102*/("""" />
    </head>
    <body>
        <div id="Container">
            <div id="Logo">
                <img class="img-responsive" src=""""),_display_(/*14.51*/routes/*14.57*/.Assets.versioned("images/apple.jpeg")),format.raw/*14.95*/("""" alt="apple">
                <h1>Core Design</h1>
                <h3> 
                    <em>Website Design and Development Services</em>
                </h3>
            </div>
            <nav class="navbar navbar-default">
                <ul class="nav navbar-nav">
                    <li """),_display_(/*22.26*/if(pageID == "Home")/*22.46*/{_display_(Seq[Any](format.raw/*22.47*/("""class="active"""")))}),format.raw/*22.62*/("""><a href=""""),_display_(/*22.73*/routes/*22.79*/.HomeController.index()),format.raw/*22.102*/("""">Home</a></li>
                    <li """),_display_(/*23.26*/if(pageID == "About")/*23.47*/{_display_(Seq[Any](format.raw/*23.48*/("""class="active"""")))}),format.raw/*23.63*/("""><a href=""""),_display_(/*23.74*/routes/*23.80*/.HomeController.about()),format.raw/*23.103*/("""">About Us</a></li>
                    <li """),_display_(/*24.26*/if(pageID == "Services")/*24.50*/{_display_(Seq[Any](format.raw/*24.51*/("""class="active"""")))}),format.raw/*24.66*/("""><a href=""""),_display_(/*24.77*/routes/*24.83*/.HomeController.services()),format.raw/*24.109*/("""">Services</a></li>
                    <li """),_display_(/*25.26*/if(pageID == "Clients")/*25.49*/{_display_(Seq[Any](format.raw/*25.50*/("""class="active"""")))}),format.raw/*25.65*/("""><a href=""""),_display_(/*25.76*/routes/*25.82*/.HomeController.clients()),format.raw/*25.107*/("""">Clients</a></li>
                    <li """),_display_(/*26.26*/if(pageID == "Contact")/*26.49*/{_display_(Seq[Any](format.raw/*26.50*/("""class="active"""")))}),format.raw/*26.65*/("""><a href=""""),_display_(/*26.76*/routes/*26.82*/.HomeController.contact()),format.raw/*26.107*/("""">Contact Us</a></li>
                </ul>
            </nav>
            <div id="Content">
                """),_display_(/*30.18*/content),format.raw/*30.25*/("""                    
            """),format.raw/*31.13*/("""</div>

            <footer>
                <h6>
                    <em>Copyright &copy; 2015 Core Design</em>
                </h6>
            </footer>
        </div>
        <script src=""""),_display_(/*39.23*/routes/*39.29*/.Assets.versioned("javascripts/main.js")),format.raw/*39.69*/("""" type="text/javascript"></script>
    </body>
</html>"""))
      }
    }
  }

  def render(pageID:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pageID)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pageID) => (content) => apply(pageID)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 24 15:05:21 GMT 2017
                  SOURCE: /home/wdd/webapps/WMDDCoreDesign/app/views/main.scala.html
                  HASH: 474e9ac09373896a3c21ecdfe71fb8ef43db5e7a
                  MATRIX: 952->1|1078->32|1106->34|1169->71|1195->77|1265->121|1291->127|1490->300|1504->306|1567->348|1652->407|1666->413|1728->454|1890->589|1905->595|1964->633|2292->934|2321->954|2360->955|2406->970|2444->981|2459->987|2504->1010|2572->1051|2602->1072|2641->1073|2687->1088|2725->1099|2740->1105|2785->1128|2857->1173|2890->1197|2929->1198|2975->1213|3013->1224|3028->1230|3076->1256|3148->1301|3180->1324|3219->1325|3265->1340|3303->1351|3318->1357|3365->1382|3436->1426|3468->1449|3507->1450|3553->1465|3591->1476|3606->1482|3653->1507|3791->1618|3819->1625|3880->1658|4101->1852|4116->1858|4177->1898
                  LINES: 28->1|33->1|35->3|36->4|36->4|38->6|38->6|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|46->14|54->22|54->22|54->22|54->22|54->22|54->22|54->22|55->23|55->23|55->23|55->23|55->23|55->23|55->23|56->24|56->24|56->24|56->24|56->24|56->24|56->24|57->25|57->25|57->25|57->25|57->25|57->25|57->25|58->26|58->26|58->26|58->26|58->26|58->26|58->26|62->30|62->30|63->31|71->39|71->39|71->39
                  -- GENERATED --
              */
          