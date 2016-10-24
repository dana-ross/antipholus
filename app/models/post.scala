package wpapi.models

import play.api.libs.json._


/**
 * @see http://v2.wp-api.org/reference/posts/
 * @see http://demo.wp-api.org/wp-json/wp/v2/posts
 */
case class WPPost() {

  var date = ""
  var date_gmt = ""
  var guid = new WPRenderedString("")
  var id = 0
  var link = ""
  var modified = ""
  var modified_gmt = ""
  var password = ""
  var slug = ""
  var status = ""
  var title = new WPRenderedString("")
  var content = new WPRenderedString("")
  var author = 0
  var excerpt = new WPRenderedString("")
  var featured_media = 0
  var comment_status = ""
  var ping_status = ""
  var format = ""
  var sticky = false
  var categories = Array[Int]()
  var tags = Array[Int]()

  def unapply(o: WPPost): Option[String] = {
    o.date
  }
}

implicit val wppostsWrites = Json.writes[WPPost]
