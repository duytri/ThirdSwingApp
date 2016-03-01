package main.scala

import swing._
import event._
import javax.swing.ImageIcon
import javax.swing.border.Border
import java.awt.Color

object ThirdSwingApp extends SimpleSwingApplication {
  def top = new MainFrame {
    resizable = false
    title = "Chương trình phân lớp văn bản theo chủ đề"
    iconImage = toolkit.getImage("./img/logo.png")

    //~~~~~~~~~~~ Title ~~~~~~~~~~~
    val icon = new Label {
      icon = new ImageIcon("./img/logo.png")
    }
    val lbTitle = new Label {
      text = " CHƯƠNG TRÌNH PHÂN LỚP VĂN BẢN THEO CHỦ ĐỀ"
      font = new Font("Dialog", java.awt.Font.BOLD, 20)
    }
    val lbSubTitle = new Label {
      text = " Phòng thí nghiệm Hệ Thống Thông Tin - Trường Đại học Công Nghệ Thông Tin - ĐHQG TP.HCM"
      font = new Font("Segoe UI Light", java.awt.Font.ITALIC, 14)
    }
    val pnIcon = new BoxPanel(Orientation.Vertical) {
      contents += icon
    }
    val pnTitleCenter = new BoxPanel(Orientation.Vertical) {
      contents += lbTitle
      contents += lbSubTitle
      border = Swing.EmptyBorder(12, 10, 10, 15)
    }
    val pnTitle = new BorderPanel() {
      layout(pnIcon) = BorderPanel.Position.West
      layout(pnTitleCenter) = BorderPanel.Position.Center
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~ Train ~~~~~~~~~~~
    val lbTrain = new Label {
      text = "CÁC THÔNG SỐ HUẤN LUYỆN"
    }
    val pnTrainR1 = new BorderPanel{
      layout(lbTrain) = BorderPanel.Position.West
    }
    ////~~~~~~~~~~~ Train-row2 ~~~~~~~~~~~
    val lbTrainR2 = new Label {
      text = "Đường dẫn thư mục dữ liệu huấn luyện (input)    "
    }
    val tfTrainR2 = new TextField {
      columns = 1
      text = "/home/duytri/Desktop/"
      border = Swing.EmptyBorder(5, 10, 5, 10)
    }
    val pnTrainR2 = new BoxPanel(Orientation.Horizontal) {
      contents += lbTrainR2
      contents += tfTrainR2
      border = Swing.EmptyBorder(10, 0, 0, 0)
    }
    ////~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ////~~~~~~~~~~~ Train-row3 ~~~~~~~~~~~
    val lbTrainR31 = new Label {
      text = "Ngưỡng TF*IDF                                   "
    }
    val lbTrainR32 = new Label {
      text = "Ngưỡng dưới  "
    }
    val tfLowerBound = new TextField {
      columns = 1
      text = "0.0006"
      border = Swing.EmptyBorder(5, 10, 5, 10)
    }
    val lbTrainR33 = new Label {
      text = "  Ngưỡng trên  "
    }
    val tfUpperBound = new TextField {
      columns = 1
      text = "0.6"
      border = Swing.EmptyBorder(5, 10, 5, 10)
    }
    val pnTrainR3 = new BoxPanel(Orientation.Horizontal) {
      contents += lbTrainR31
      contents += lbTrainR32
      contents += tfLowerBound
      contents += lbTrainR33
      contents += tfUpperBound
      border = Swing.EmptyBorder(10, 0, 0, 0)
    }
    ////~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ////~~~~~~~~~~~ Train-row4 ~~~~~~~~~~~
    val lbTrainR4 = new Label {
      text = "Đường dẫn thư mục lưu trữ mô hình huấn luyện  "
    }
    val tfModelDir = new TextField {
      columns = 1
      text = "/home/duytri/Desktop/"
      border = Swing.EmptyBorder(5, 10, 5, 10)
    }
    val pnTrainR4 = new BoxPanel(Orientation.Horizontal) {
      contents += lbTrainR4
      contents += tfModelDir
      border = Swing.EmptyBorder(10, 0, 0, 0)
    }
    ////~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ////~~~~~~~~~~~ Train-row5 ~~~~~~~~~~~
    val lbTrainR5 = new Label {
      text = "Tỷ lệ phân chia dữ liệu huấn luyện                        "
    }
    val tfTrainPercent = new TextField {
      columns = 1
      text = "0.7"
      border = Swing.EmptyBorder(5, 10, 5, 10)
    }
    val pnTrainR5 = new BoxPanel(Orientation.Horizontal) {
      contents += lbTrainR5
      contents += tfTrainPercent
      border = Swing.EmptyBorder(10, 0, 0, 0)
    }
    ////~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    val pnTrain = new BoxPanel(Orientation.Vertical) {
      contents += pnTrainR1
      contents += pnTrainR2
      contents += pnTrainR3
      contents += pnTrainR4
      contents += pnTrainR5
      border = Swing.EmptyBorder(15, 10, 25, 15)
    }
    val pnTrainBoder = new BoxPanel(Orientation.Vertical) {
      contents += pnTrain
      border = Swing.LineBorder(Color.BLUE, 1)
    }
    val pnTrainGroup = new BoxPanel(Orientation.Vertical) {
      contents += pnTrainBoder
      border = Swing.EmptyBorder(15, 10, 15, 15)
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~ Test ~~~~~~~~~~~
    val lbTest = new Label {
      text = "CÁC THÔNG SỐ KIỂM THỬ"
    }
    val pnTestR1 = new BorderPanel{
      layout(lbTest) = BorderPanel.Position.West
    }
    val lbTestInput = new Label {
      text = "Đường dẫn tập tin văn bản kiểm thử (*.txt)           "
    }
    val tfTestLink = new TextField {
      columns = 1
      text = "/home/duytri/Desktop/test.txt"
      border = Swing.EmptyBorder(5, 10, 5, 10)
      enabled = false
    }
    val pnTestInput = new BoxPanel(Orientation.Horizontal) {
      contents += lbTestInput
      contents += tfTestLink
      border = Swing.EmptyBorder(10, 0, 0, 0)
    }
    val pnTest = new BoxPanel(Orientation.Vertical) {
      contents += pnTestR1
      contents += pnTestInput
      border = Swing.EmptyBorder(15, 10, 25, 15)
    }
    val pnTestBoder = new BoxPanel(Orientation.Vertical) {
      contents += pnTest
      border = Swing.LineBorder(Color.BLUE, 1)
    }
    val pnTestGroup = new BoxPanel(Orientation.Vertical) {
      contents += pnTestBoder
      border = Swing.EmptyBorder(0, 10, 25, 15)
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~ Center ~~~~~~~~~~~
    val pnCenter = new BoxPanel(Orientation.Vertical) {
      contents += pnTrainGroup
      contents += pnTestGroup
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~ Button ~~~~~~~~~~~
    val lbStatus = new Label {
      text = "Sẵn sàng..."
      font = new Font("Segoe UI Light", java.awt.Font.ITALIC, 14)
    }
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
    val pnButtonRight = new BoxPanel(Orientation.Horizontal) {
      contents += btnTrain
      contents += new Label("   ")
      contents += btnTest
      contents += new Label("   ")
      contents += btnClose
      contents += new Label("        ")
    }
    val pnButton = new BorderPanel {
      layout(lbStatus) = BorderPanel.Position.West
      layout(pnButtonRight) = BorderPanel.Position.East
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~ Main ~~~~~~~~~~~
    contents = new BorderPanel {
      layout(pnTitle) = BorderPanel.Position.North
      layout(pnCenter) = BorderPanel.Position.Center
      layout(pnButton) = BorderPanel.Position.South
      border = Swing.EmptyBorder(15, 15, 17, 10)
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~ Events ~~~~~~~~~~~
    listenTo(btnClose)
    reactions += {
      case ButtonClicked(`btnClose`) =>
        closeOperation()
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  }
}