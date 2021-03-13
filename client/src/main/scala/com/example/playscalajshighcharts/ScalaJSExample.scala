package com.example.playscalajshighcharts

import com.example.playscalajshighcharts.shared.SharedMessages
import org.scalajs.dom


import scalajs.js, js.UndefOr
import org.scalajs.jquery.jQuery
import com.highcharts.HighchartsUtils._
import com.highcharts.HighchartsAliases._
import com.highcharts.config._


@js.native
trait Highcharts extends js.Object {
  def chart(id: String, config: HighchartsConfig)
}

object ScalaJSExample {



  def main(args: Array[String]): Unit = {


    jQuery("#container").highcharts(new HighchartsConfig {
      // Chart config
      override val chart: Cfg[Chart] = Chart(`type` = "line")

      // Chart title
      override val title: Cfg[Title] = Title(text = "Run Temperature")

      // X Axis settings
      override val xAxis: CfgArray[XAxis] = js.Array(XAxis(categories = js.Array("1", "2", "3")))

      // Y Axis settings
      override val yAxis: CfgArray[YAxis] = js.Array(YAxis(title = YAxisTitle(text = "T")))

      // Series
      override val series: SeriesCfg = js.Array[AnySeries](
        SeriesSpline(name = "run", data = js.Array[Double](1, 0, 4))
      )
    })

  }
}
