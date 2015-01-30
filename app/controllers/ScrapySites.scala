package controllers

import play.api.mvc.Action
import play.api.mvc.Controller

import models.ScrapySite

object ScrapySites extends Controller{
  def list = Action { implicit request =>
    val scrapysites = ScrapySite.scrapySites.toList
    Ok(views.html.scrapysite.list(scrapysites))
  }

}
