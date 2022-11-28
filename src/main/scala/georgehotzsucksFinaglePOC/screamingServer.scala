package georgehotzsucksFinaglePOC

import com.twitter.finagle.Thrift
import com.twitter.util.{Await, Future, Return, Throw}
import com.typesafe.config.ConfigFactory

class screamingServer extends ScreamService.MethodPerEndpoint {
  override def multiply(number1: Int, number2:Int): Future[Long] = {
    println("Multiplying " + number1 + " and " + number2)
    Future.value(number2 * number1)
  }
}

object screamingServer{
  def main(args: Array[String]): Unit = {
    val conf = ConfigFactory.load("server.conf")
    val host = conf.getString("host")
    val port = conf.getString("port")
    val server = Thrift.server.serveIface(s"$host$port", new screamingServer())
    Await.ready(server)
  }
}