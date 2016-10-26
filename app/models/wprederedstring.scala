package wpapi.models

import play.api.libs.json._

class WPRenderedString(pRedered:String) {
    var rendered = pRedered
}

/**
 * Companion Object to WPRenderedString
 */
object WPRenderedString {
    implicit val wpRenderedStringWrites:Writes[WPRenderedString] = new Writes[WPRenderedString] {
        def writes(c: WPRenderedString): JsValue = {
            Json.obj(
                "rendered" -> c.rendered
            )
        }
    }
}

