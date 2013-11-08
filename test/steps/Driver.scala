
package steps

import play.api.test.{TestBrowser, TestServer}

object Driver {
  private val port = 3333
  private val testServer = TestServer(port)
  val browser = TestBrowser.firefox()
  testServer.start

  def visit(path: String) = {
    browser.goTo("http://ikenna.net/" )
  }
}
