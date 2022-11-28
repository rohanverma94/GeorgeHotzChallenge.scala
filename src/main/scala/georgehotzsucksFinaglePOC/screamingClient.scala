package georgehotzsucksFinaglePOC

import com.twitter.finagle.Thrift
import com.twitter.util.Future

import java.time.Instant

object screamingClient {
  def apply(host: String, port: String): screamingClient = new screamingClient(host, port)
}

class screamingClient(val host: String, val port: String) {
  private val methodPerEndpoint = Thrift.client.build[ScreamService.MethodPerEndpoint](s"$host$port")

  def sendMessage(number1: Int, number2:Int): Future[Long] = methodPerEndpoint.multiply(number1, number2)

  def close(): Unit = {
    methodPerEndpoint.asClosable.close()
    ()
  }
}