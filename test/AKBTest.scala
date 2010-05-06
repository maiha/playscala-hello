import java.util._
import play.test._
import models._

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class AKBTest extends UnitTest with FlatSpec with ShouldMatchers {
    
  it should "キャッキャウフフ" in {
    var mayu = AKB.loadXML("mayuyu.xml")

    "渡辺麻友" should equal (mayu.name)
    "渡辺麻友" should equal (mayu.toString)
  }
 
}
