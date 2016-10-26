package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json._
import wpapi.models._

trait JSONPCompatibleController {
    def toJson(json: JsValue, jsonp: Option[String]) : String = jsonp match {
        case Some(f) => "/**/" + f + '(' + Json.stringify(json) + ')'
        case None => Json.stringify(json)
    }
}

@Singleton
class PostsController extends Controller with JSONPCompatibleController {

    def query(_jsonp: Option[String]) = Action {
        var results:Array[WPPost] = Array(new WPPost, new WPPost, new WPPost, new WPPost)
        Ok(toJson(Json.toJson(results), _jsonp))
    }
}