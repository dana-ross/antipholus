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
  var post_type = ""
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

}

object WPPost {
    implicit val wpPostWrites:Writes[WPPost] = new Writes[WPPost] {
        def writes(c: WPPost): JsValue = {
            Json.obj(
                // @TODO match order of the original API
                "id" -> c.id,
                "guid" -> c.guid,
                "type" -> c.post_type,
                "format" -> c.format,
                "status" -> c.status,
                "slug" -> c.slug,
                "guid" -> c.guid,
                "sticky" -> c.sticky,
                "password" -> c.password,
                "title" -> c.title,
                "content" -> c.content,
                "excerpt" -> c.excerpt,
                "author" -> c.author,
                "featured_media" -> c.featured_media,
                "categories" -> c.categories,
                "tags" -> c.tags,
                "comment_status" -> c.comment_status,
                "ping_status" -> c.ping_status,
                "date" -> c.date,
                "date_gmt" -> c.date_gmt,
                "modified" -> c.modified,
                "modified_gmt" -> c.modified_gmt
            )
        }
    }
}

