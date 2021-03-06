package rpgboss.editor

import rpgboss.editor.dialog._
import rpgboss.editor.uibase._

import scala.swing._
import scala.swing.event._

import rpgboss.model._
import rpgboss.model.resource._

class StartPanel(val mainP: MainPanel)
  extends BoxPanel(Orientation.Horizontal) {
  contents += new Label("Logo here")

  contents += new BoxPanel(Orientation.Vertical) {
    contents += new Button(mainP.actionNew)
    contents += new Button(mainP.actionOpen)
  }
}

