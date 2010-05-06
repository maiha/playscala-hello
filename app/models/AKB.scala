package models

import scala.xml.{XML, Elem}

case class AKB(xml: Elem) {
  // Accessor Methods
  def name  = get("name")
  def nick  = get("nick")
  def team  = get("team")

  // Getter Methods
  def get(key: String) = xml \ key text
  override def toString = name + "(" + nick + ") [Team " + team + "]"
}

object AKB {
  def loadXML(path: String) = AKB(XML.loadFile(path))
  def loadUrl(url:  String) = AKB(XML.load(url))
}
