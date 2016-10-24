package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json._
import wpapi.models._

@Singleton
class PostsController extends Controller {

    def query = Action {
        var results:Array[WPPost] = Array(new WPPost, new WPPost, new WPPost, new WPPost)
        Ok(Json.toJson(results))
    }
}