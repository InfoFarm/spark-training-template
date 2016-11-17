import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by Ben.
  */
object SampleSparkApp extends App {

  val sparkConf = new SparkConf().setMaster("local").setAppName("My App")

  val sparkContext = new SparkContext(sparkConf)

  val list = List ("okapi", "lion", "elephant", "giraffe", "buffoon")

  val animalRDD = sparkContext.parallelize(list)

  println(animalRDD.distinct().count())

  val capitalAnimals = animalRDD.map(animal => animal.toUpperCase)

  //Local
  for(animal <- capitalAnimals.collect()) {
    println(animal)
  }

  //On cluster
  capitalAnimals.foreach(println)

  capitalAnimals.sample(false, 0.5).foreach(println)

  capitalAnimals.reduce((a, b) => a + b).foreach(println)


  //Read from file
  private val sampleData: RDD[String] = sparkContext.textFile("src/main/resources/sample")
  sampleData.foreach(println)

}
