package main.scala

import swing._
import event._
import javax.swing.ImageIcon

object ThirdSwingApp extends SimpleSwingApplication {
  def top = new MainFrame {
    resizable = true
    title = "Chương trình phân lớp văn bản theo chủ đề"
    bounds = new Rectangle(100, 100, 700, 450)
    size = new Dimension(700, 450)
    iconImage = toolkit.getImage("./img/logo.png")

    //~~~~~~~~~~~ Title ~~~~~~~~~~~
    val icon = new Label {
      icon = new ImageIcon("./img/logo.png")
    }

    val lbTitle = new Label {
      text = "CHƯƠNG TRÌNH PHÂN LỚP VĂN BẢN THEO CHỦ ĐỀ"
      font = new Font("Dialog", java.awt.Font.BOLD, 20)
    }

    val lbSubTitle = new Label {
      text = "Phòng thí nghiệm Hệ Thống Thông Tin - Trường Đại học Công Nghệ Thông Tin - ĐHQG TP.HCM"
      font = new Font("Segoe UI Light", java.awt.Font.ITALIC, 14)
    }

    val pnTitle = new BorderPanel() {
      layout(icon) = BorderPanel.Position.West
      layout(lbTitle) = BorderPanel.Position.Center
      layout(lbSubTitle) = BorderPanel.Position.South
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~ Train ~~~~~~~~~~~
    val pnTrain = new BoxPanel(Orientation.Vertical) {

    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~ Test ~~~~~~~~~~~
    val pnTest = new BoxPanel(Orientation.Vertical) {

    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~ Center ~~~~~~~~~~~
    val pnCenter = new BorderPanel {
      layout(pnTrain) = BorderPanel.Position.North
      layout(pnTest) = BorderPanel.Position.South
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~ Button ~~~~~~~~~~~
    val lbStatus = new Label(" Sẵn sàng...")

    val btnTrain = new Button {
      text = "Huấn luyện"
      enabled = true
    }

    val btnTest = new Button {
      text = "Kiểm thử"
      enabled = false
    }

    val btnClose = new Button {
      text = "Đóng"
      enabled = true
    }

    val pnButton = new BoxPanel(Orientation.Horizontal) {
      contents += lbStatus
      contents += btnTrain
      contents += btnTest
      contents += btnClose
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~ Main ~~~~~~~~~~~
    contents = new BorderPanel {
      layout(pnTitle) = BorderPanel.Position.North
      layout(pnCenter) = BorderPanel.Position.Center
      layout(pnButton) = BorderPanel.Position.South
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  }
}