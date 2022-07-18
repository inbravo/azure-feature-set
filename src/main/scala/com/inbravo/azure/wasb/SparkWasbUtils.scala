package com.inbravo.azure.wasb

import org.apache.spark.{SparkConf, SparkContext}

/**
 * Test IO to Windows Azure Storage Blob (WASB)
 * amit.dixit
 */
object SparkWasbUtils {

  /*
   * Main executor method
   */
  def main(arg: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("SparkCore_WasbIOTest")
    val sc = new SparkContext(conf)

    val rdd = sc.textFile("wasb:///HdiSamples/HdiSamples/SensorSampleData/hvac/HVAC.csv")

    // find the rows which have only one digit in the 6th column
    val rdd1 = rdd.filter(s => s.split(",")(6).length() == 1)

    rdd1.saveAsTextFile("wasb:///HVACout2")
  }
}
