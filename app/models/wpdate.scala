package wpapi.models

import play.api.libs.json._

case class WPDate() {
    var date = ""
    var timezone = ""
    var date_gmt = ""

    /**
     * @param d date
     * @param t timezone for date
     */
    def WPDate(d:String, t:String) {
        date = d
        timezone = t
    }

    def WPDate(gmt:String) {
        date_gmt = gmt
        timezone = "UTC"
    }
}

object WPDate {

}
